public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id,Customer customer,double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }
    public int getId(){
        return this.id;
    }
    public Customer getCustomer(){
        return this.customer;
    }

    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public double getAmount(){
        return this.amount;
    }
    
    public void setAmount(double amount){
        this.amount=amount;
    }

    public int getCustomerId(){
        return this.customer.getId();
    }
    public String getCustomerName(){
        return this.customer.getName();
    }

    public int getCustomerDiscount(){
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return this.amount-this.customer.getDiscount()*this.amount/100;
    }
    @Override
    public String toString(){
        return String.format("Invoice[id=%d,customer=%s(%d)(%d%%),amount=%f]",this.id,this.customer.getName(),this.customer.getId(),this.customer.getDiscount(),this.amount);
    }
}
