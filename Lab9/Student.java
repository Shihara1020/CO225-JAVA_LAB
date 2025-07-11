import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final int Enumber;
    private final double grade;

    public Student(String name, int Enumber, double grade) {
        this.name = name;
        this.Enumber = Enumber;
        this.grade = grade;
    }

    // Natural ordering by E number (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.Enumber, other.Enumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Enumber == student.Enumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Enumber);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', E%d, grade=%.1f}", name, Enumber, grade);
    }

    // Getters
    public String getName() { return name; }
    public int getEnumber() { return Enumber; }
    public double getGrade() { return grade; }
}