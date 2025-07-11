package mypackage;

public class Test {
    public static void main(String args[]) {
        try{
            method1(-1);
        }
        catch (AgelessthanException e){
            System.out.println(e.getMessage());
        }


        }
    public static void method1(int age) throws AgelessthanException{
        if(age<0){
            throw new AgelessthanException("age cant lessthan zero");
        }
    }
}
