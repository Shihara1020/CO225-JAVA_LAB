import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ProfileLoader {
    public static void main(String[] args) {
        ArrayList<StudentProfile> students = new ArrayList<>();
        try{
            File in =new File("C:\\Users\\eranj\\Desktop\\ACADAMIC FOLDER\\Fourth Semester\\CO225-SOFTWARE CONSTRUCTION\\Lab\\Lab6\\ProjectFolder\\student_data.csv");
            Scanner sc = new Scanner(in);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                try{
                    String[] tokens = line.split(",");
                    if(tokens.length!=5){
                        throw new IllegalArgumentException("Invalid profile file format in line: "+line);
                    }

                    String studentId = tokens[0];
                    String firstName = tokens[1];
                    String lastName = tokens[2];
                    int score = Integer.parseInt(tokens[3]);
                    int activeEngagementTime = Integer.parseInt(tokens[4]);

                    StudentProfile profile = new StudentProfile(studentId, firstName, lastName, score, activeEngagementTime);
                    students.add(profile);
                }catch (NumberFormatException e){
                   System.err.println("Error: Invalid number format in line: " + line);
                }catch(IllegalArgumentException e){
                    System.err.println("Invalid profile file format in line: "+e.getMessage());
                }
            }

            System.out.println("\nLoaded Students:");
            for (StudentProfile s : students) {
                System.out.println(s);
            }



    }catch (FileNotFoundException e){
            System.err.println("Error: student_data.csv not found. Place it in the application directory.");
        }
        }
}
