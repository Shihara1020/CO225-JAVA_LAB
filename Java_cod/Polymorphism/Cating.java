class A{
    public A(){
        System.out.println("This is A of Cons");
    }
    @Override
    public String toString(){
        return "this is A";
    }

    public void obj1(){
        System.out.println("a1");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("This is B of Cons");
    }
    @Override
    public String toString(){
        return "this is B";
    }

    public void obj2(){
        System.out.println("b1");
    }
}
class C extends B{
    public C(){
        super();
        System.out.println("This is C of Cons");
    }
    @Override
    public String toString(){
        return "this is C";
    }

    public void obj3(){
        System.out.println("c1");
    }
}
public class Cating {
    public static void main(String[] a){
        A a1=new C();
        System.out.println(a1);

        a1.obj1();

        B b1 =(B) a1;

        C c1=(C) a1;
        c1.obj2();


    }
    
}
