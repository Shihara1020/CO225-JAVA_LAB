public class Customer{
    private int id;
    private String name;
    private int discount;

    public Customer(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
    public int getDiscount(){
        return this.discount;
    }

    public void setDiscount(int discount){
        this.discount=discount;

    }
    
    @Override
    public String toString(){
        return String.format("%s(%d)(%d%%)",name,id,discount); 
    }
}