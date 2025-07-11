package Task_2;

public class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)  throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("amount is less than zero");
        }
        balance += amount;
    }
    public void withdraw(double amount) throws InvalidAmountException{
        this.deposit(amount);
        this.balance -= amount;
    }
    public void transfer(BankAccount target, double amount) throws InvalidAmountException, InsufficientFundsException{
        if(amount<0){
            throw new InvalidAmountException("amount is less than zero");
        }
        if(this.balance<amount){
            throw new InsufficientFundsException("Insufficient");
        }
        target.deposit(amount);
        this.balance -= amount;

    }
}
