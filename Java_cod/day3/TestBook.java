public class TestBook {
    public static void main(String []args){
        Author ahteck=new Author("Tan Ah teck","teck@somehwre.com",'m');
        System.out.println(ahteck);

        Book dummyBook=new Book("Java for dummies",ahteck,9.99,99);

        System.out.println(dummyBook);

        dummyBook.setPrice(8.8);
        dummyBook.setQty(88);
        System.out.println("Name is: "+dummyBook.getName());

        System.out.println("Price is: "+dummyBook.getPrice());

        System.out.println("qrt is: "+dummyBook.getQty());

        System.out.println("author is: "+dummyBook.getAuthor());

        System.out.println("author's name is: "+dummyBook.getAuthor().getName());

        System.out.println("author's email is: "+dummyBook.getAuthor().getEmail());
        
        System.out.println("author's gender is: "+dummyBook.getAuthor().getGender());

        Book moreDummyBook=new Book("Java for more dummies",new Author("peter Lee","peter@nowhere.com",'m'),19.99,8);

        System.out.println(moreDummyBook);








    }
}
