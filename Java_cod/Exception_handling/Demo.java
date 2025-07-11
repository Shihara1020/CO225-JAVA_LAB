public class Demo {
    public static void main(String[] args) {
        int i=0;
        int j=5;

        int [] nums=new int[5];
        try{

            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("This wrong zero .."+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This wrong index .."+e);
        }

    }
}
