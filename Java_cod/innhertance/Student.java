public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name,String address){
        super(name,address);
        numCourses=0;
        courses=new String[30];
        grades=new int[30];
    }
    
    @Override
    public String toString(){
        return "Student"+super.toString();
    }
    
    public void addCourseGrade(String course,int grade){
        this.courses[numCourses]=course;
        this.grades[numCourses]=grade;
        this.numCourses++;

    }

    public void printGrades(){
        for(int i=0;i<this.numCourses;i++){
            System.out.println(this.grades[i]);
        }
    }
    public double getAvg(){
        int sum=0;
        for(int i=0;i<this.grades.length;i++){
            sum+=this.grades[i];
        }

        return (double)sum/grades.length;
    }
}
