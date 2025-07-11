import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionDemo {
    public static void main(String[] args) {
        BankAccount barneyAccount = new BankAccount("GNB123", 1000.00);
        BankAccount marshallAccount = new BankAccount("GNB456", 500.00);

        // Successful deposit
        try {
            barneyAccount.deposit(200.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
        }

        // Invalid withdrawal (negative)
        try {
            barneyAccount.withdraw(-100.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
        }

        // Valid withdrawal
        try {
            barneyAccount.withdraw(300.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
        }

        // Overdrawn transfer
        try {
            barneyAccount.transferTo(marshallAccount, 2000.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
        }

        // Valid transfer
        try {
            barneyAccount.transferTo(marshallAccount, 100.00);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            logTransaction();
        }

        // Final balances
        System.out.println("\n--- Final Account Balances ---");
        System.out.println(barneyAccount);
        System.out.println(marshallAccount);
    }

    private static void logTransaction() {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timeStamp + "] Transaction attempt completed.");
    }
}
