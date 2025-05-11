import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){

        String instr;
        int  Strlen;

        System.out.print("Enter a String: ");
        Scanner x=new Scanner(System.in);
        instr=x.nextLine();
        Strlen=instr.length();

        System.out.print("The reverse of the String "+ instr+" is ");

        for(int i=Strlen-1;i>=0;--i){
            System.out.printf("%c",instr.charAt(i));
        }


    }
}
