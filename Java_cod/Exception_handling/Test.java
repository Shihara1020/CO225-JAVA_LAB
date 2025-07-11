public class Test {
    public static void main(String[] args) throws AgelessthanException {
        try{
            validateAge(-1);
        }
        catch(AgelessthanException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws AgelessthanException{
        if(age<0){
            throw new AgelessthanException("this wrong age");
        }
    }

}
