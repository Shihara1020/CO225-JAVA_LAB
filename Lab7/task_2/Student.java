package task_2;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String courseName;

    public Student(int id, String name, String courseName) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
    }
    @Override
    public String toString(){
        return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + "]";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.id == s.id && courseName.equals(s.courseName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,courseName);

    }
}
