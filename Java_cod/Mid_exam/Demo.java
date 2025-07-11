@FunctionalInterface
interface A{
    void method();
}
public class Demo {
    public static void main(String arg[]){
        A obj =()->System.out.println("this is");
        obj.method();


    }


}
