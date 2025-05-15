public class TestMain {
    public static void main(String []a){
        Animal obj1=new Animal("Animal");
        System.out.println(obj1);

        Mammal obj2 =new Mammal("Mammal");
        System.out.println(obj2);

        Cat obj3=new Cat("puus");
        obj3.greets();
        System.out.println(obj3);

        Dog obj4=new Dog("Jimmy");
        obj4.greets();
        Dog obj5=new Dog("browny");       
        obj4.greets(obj5);
        System.out.println(obj4);

    }
    
}
