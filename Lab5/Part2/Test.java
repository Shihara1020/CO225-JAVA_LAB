import java.util.Date;
public class Test {
    public static void main(String []a){
        Customer customer = new Customer("Thamish");
        customer.setMember(true);
        customer.setMemberType("Gold");

        Visit visit = new Visit(customer.getName(), new Date());
        visit.getCustomer().setMember(true);
        
        visit.getCustomer().setMemberType("Gold");
        visit.setServiceExpense(100.0); // Before discount
        visit.setProductExpense(50.0); // Before discount
        System.out.println("Customer: " + visit.getCustomer());
        System.out.println("Service Expense after discount: $" +
        visit.getServiceExpense());
        System.out.println("Product Expense after discount: $" +
        visit.getProductExpense());
        System.out.println("Total Expense: $" +
        visit.getTotalExpense());
    }
    
}
