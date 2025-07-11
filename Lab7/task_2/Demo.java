package task_2;
import task_2.Student;

import java.util.HashSet;
import java.util.Set;

public class Demo{
    public static void main(String[] args) {
        Set<Student> Studentlist = new HashSet<Student>();
        Studentlist.add(new Student(1,"Abbb","java"));
        Studentlist.add(new Student(1,"Abbb","php"));  //same id number but different course
        Studentlist.add(new Student(2,"Aaa","C++"));
        Studentlist.add(new Student(2,"Aaa","C++")); // same id number and course
        Studentlist.add(new Student(3,"Bbb","pyhton"));
        Studentlist.add(new Student(3,"Hhh","Ruby"));

        Studentlist.add(new Student(4,"Ccc","html"));
        Studentlist.add(new Student(5,"Ddd","Css"));
        Studentlist.add(new Student(6,"Eee","Javascript"));


        for(Student student : Studentlist){
            System.out.println(student);
        }

        System.out.println("number of unique student is  "+Studentlist.size());

    }

}