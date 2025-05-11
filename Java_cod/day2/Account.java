public class Account {
    private int number;
    private double balance=0.0;
    public Account(int number){
        this.number=number;
    }

    public Account(int number,double balance){
        this.number=number;
        this.balance=balance;
    }

    public int getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return String.format("Account[number=%d,balance=$%.2f]",this.number,this.balance);
    }

    public void credit(double amount){
        this.balance+=amount;
    }

    public void debit(double amount){
        if(this.balance>=amount) this.balance-=amount;
        else System.out.println("amount exceed");
    }

    public void trasferTo(double amount,Account another){
        if(this.balance>=amount){
            this.balance-=amount;
            another.balance+=amount;

        }else{
            System.out.println("amount exceed");
        }
    }

    
}
