import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        // Part 1: Natural ordering (by E number)
        TreeSet<Student> studentsByEnumber = new TreeSet<>();
        studentsByEnumber.add(new Student("Chamika", 415, 14.0));
        studentsByEnumber.add(new Student("Lisitha", 9, 13.3));
        studentsByEnumber.add(new Student("Thisen", 231, 10.7));
        studentsByEnumber.add(new Student("Hirushi", 19, 10.7));
        studentsByEnumber.add(new Student("Chamodi", 96, 11.3));
        // :v
        // add yours and your friends results
        studentsByEnumber.add(new Student("Sahandi", 45, 15.2));
        studentsByEnumber.add(new Student("Fikry", 123, 12.8));
        studentsByEnumber.add(new Student("Shihara", 78, 9.5));
        studentsByEnumber.add(new Student("Tharindu", 156, 13.7));

        System.out.println("Natural Order (by E number):");
        for (Student student : studentsByEnumber) {
            System.out.println(student);
        }

        // Part 2: Custom ordering (by grade, descending)
        TreeSet<Student> studentsByGrade = new TreeSet<>(new GradeComparator());
        studentsByGrade.addAll(studentsByEnumber); // Reuse the same students
        /*
         * Briefly explain the difference between using
         * TreeSet<Student> studentsByEnumber = new TreeSet<>();
         * and
         * TreeSet<Student> studentsByGrade = new TreeSet<>(new GradeComparator());
         * and how it affects the two different printed results
         * Write your answer as a comment below:
         *
         * ANSWER:
         * 1. TreeSet<Student> studentsByEnumber = new TreeSet<>();
         *    - Uses the natural ordering defined by Student's compareTo() method
         *    - Sorts students by E number in ascending order (9, 19, 45, 78, 96, ...)
         *    - The ordering is based on the Comparable<Student> interface implementation
         *
         * 2. TreeSet<Student> studentsByGrade = new TreeSet<>(new GradeComparator());
         *    - Uses the custom ordering defined by GradeComparator's compare() method
         *    - Sorts students by grade in descending order (highest grade first)
         *    - When grades are equal, sorts by name alphabetically
         *    - The ordering overrides the natural ordering with a custom Comparator
         *
         * The first TreeSet shows students ordered by E number (institutional order),
         * while the second shows students ordered by academic performance (grade-based ranking).
         */

        System.out.println("\nGrade Order (Highest First):");
        // TODO : print the set
        for (Student student : studentsByGrade) {
            System.out.println(student);
        }


    }
}



