public class Account {
    private String  nic;
    private String fullName;
    private int balance;

    public Account(String nic,String fullName){
        this.nic=nic;
        this.fullName=fullName;
        this.balance=0;
    }

    public Account(String nic,String fullName,int balance){
        this.nic=nic;
        this.fullName=fullName;
        this.balance=balance;
    }

    public String  getNIC(){
        return this.nic;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getBalance(){
        return this.balance;
    }

    public int credit(int amount){
        this.balance+=amount;
        return this.balance;
    }

    public int debit(int amount){
        if(amount>this.balance){
            System.out.println("warning : no sufficient amount");
            return this.balance;

        }
        this.balance-=amount;
        return this.balance;

    }

    public int transferTo(Account another,int amount){
        if(amount>this.balance){
            System.out.println("No sufficient balance in your account to transfer");
            return this.balance;
        }
        this.balance-=amount;
        another.balance+=amount;
        return this.balance;
    }

    public boolean isEligibleForLoan(){
        if(this.balance>500) return true;
        else return false;
    }

    public String toString(){
        return String.format("Account[NIC=%s,fullName=%s,balance=%d]",this.nic,this.fullName,this.balance);

    }

    
    
}
