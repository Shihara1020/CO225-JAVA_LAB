public class Main {
    public static void main(String[] args){
        Point p1=new Point(1,2);
        try{
            p1.setX(-5);
            System.out.println("This valid");
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
            System.out.println("Invalid");
        }



    }    
}

