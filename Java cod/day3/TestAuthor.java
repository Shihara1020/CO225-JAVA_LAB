public class TestAuthor {
    public static void main(String[] args){
        Author ahteck=new Author("Tan Ah teck","teck@nowhwre.com",'m');
        System.out.println(ahteck);

        ahteck.setEmail("teck@somewhere.com");
        System.out.println(ahteck);

        System.out.println(ahteck);

        System.out.println("name is: "+ahteck.getName());

        System.out.println("gender is: "+ahteck.getGender());

        System.out.println("email is :"+ahteck.getEmail());

        }
    
}
