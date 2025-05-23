import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    Visit(String name,Date data){
        
        this.customer = new Customer(name);
        this.date=date;
    }
    
    public double getServiceExpense(){
        return this.serviceExpense - this.serviceExpense * Discountrate.getServiceDiscountRate(this.customer.getMembertype());
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void setServiceExpense(double ex){
        this.serviceExpense=ex;
    }

    public double getProductExpense(){
        return this.productExpense - this.productExpense * Discountrate.getproductDiscountRate(this.customer.getMembertype());
    }

    public void setProductExpense(double ex){
        this.productExpense=ex;
    }
    public double getTotalExpense(){
        return getProductExpense()+getServiceExpense();
    }


    
}
