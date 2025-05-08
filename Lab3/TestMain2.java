public class TestMain2 {
    public static void main(String[] args) {
        Account ross = new Account("672911234V", "Ross Geller", 500);
        Account rachel = new Account("696121234V", "Rachel Green");
        System.out.println(ross);
        System.out.println(rachel);
        // Test Getters
        System.out.println("NIC: " + ross.getNIC());
        System.out.println("Full Name: " + ross.getFullName());
        System.out.println("Balance: " + ross.getBalance());
        // Credit, Debit
        ross.credit(600);
        System.out.println(ross);
        ross.debit(200);
        System.out.println(ross);
        ross.debit(2000); // Should print error
        System.out.println(ross);
        
        //Trasfer
        ross.transferTo(rachel, 300);
        System.out.println(ross);
        System.out.println(rachel);
        // Loan Eligibility
        System.out.println("Ross loan eligible? " +
        ross.isEligibleForLoan());
        System.out.println("Rachel loan eligible? " +
        rachel.isEligibleForLoan());
 }

    
}
