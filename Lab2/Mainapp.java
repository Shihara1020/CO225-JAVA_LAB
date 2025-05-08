import java.util.*;

public class Mainapp{
    public static void main(String[] args){
        final int SENTINEL=-1;
        final int MAX_SIZE=100;

        Scanner in =new Scanner(System.in);
        int[] input= new int[MAX_SIZE];
        int count=0;

        //read up to 100 positive integers
        System.out.print("Enter a positive integer(or -1 to end): ");

        int number=in.nextInt();
        while(number!=SENTINEL && count < MAX_SIZE){
            if(number>0){
                input[count]=number;
                count++;
            }
            System.out.print("Enter a positive ineger(or -1 to end): ");
            number=in.nextInt();
        }


        //1.Filer numbers containing digit 8
        int[] filltered=new int[count];
        int filteredCount=0;
        for(int i=0;i<count;i++){
            if(hasEight(input[i])){
                filltered[filteredCount]=input[i];
                filteredCount++;
            }
        }

        // 2. Compute sum
        int sum=0;
        for(int i=0;i<filteredCount;i++){
            sum+=filltered[i];
        }
        System.out.println("Sum of those numbers is "+sum);


        // 3. Sort filtered number is descending order
        sortDescending(filltered,filteredCount);

        // 4. Print the finaln array and sum
        printArray(filltered,filteredCount);


    }

    //check if number contains the digit 8
    public static boolean hasEight(int number){
        int temp=number;
        while(temp!=0){
            int digit =temp%10;
            if(digit==8) return true;
            temp=temp/10;
        }
        return false;

    }

    public static void printArray(int[] array,int size){
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(array[i]);
            if(i<size-1) System.out.print(", ");
        }
        System.out.println("]");

    }

    public static void sortDescending(int[] array,int size){
        for(int i=0;i<size;i++){
            int max=array[i];
            int index=i;
            for(int j=i+1;j<size;j++){
                if(array[j]>max){
                    max=array[j];
                    index=j;
                }
            }
            if(i!=index){
                int temp=array[i];
                array[i]=max;
                array[index]=temp;
            }
        }

    }

}
