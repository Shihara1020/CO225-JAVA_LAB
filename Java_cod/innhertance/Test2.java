class A{
    public A(){
        System.out.println("This A");
    }

    
}

class B extends A{
    public B(){
        System.out.println("This B");
    }
    public B(int a){
        this();
        System.out.println("This B int");
    }
    
}



public class Test2 {
    public static void main(String a[]){
        B obj=new B();
    } 
    
    
}
