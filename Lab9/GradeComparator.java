import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    // Order by grade (descending), then name (ascending)
    @Override
    public int compare(Student s1, Student s2) {
        int gradeComparison = Double.compare(s2.getGrade(), s1.getGrade());
        if (gradeComparison != 0) {
            return gradeComparison;
        }
        return s1.getName().compareTo(s2.getName());
    }
    /*
     * Explain why we use s2.getGrade() first in Double.compare()
     * instead of s1.getGrade() to achieve descending order:
     *
     * ANSWER: Double.compare(a, b) returns:
     * - Negative value if a < b
     * - Zero if a == b
     * - Positive value if a > b
     *
     * For descending order (highest first), we want higher grades to come first.
     * By using Double.compare(s2.getGrade(), s1.getGrade()), we reverse the comparison:
     * - If s1 has higher grade than s2, s2.getGrade() < s1.getGrade(), so compare returns negative,
     *   placing s1 before s2 (correct for descending order)
     * - If s1 has lower grade than s2, s2.getGrade() > s1.getGrade(), so compare returns positive,
     *   placing s1 after s2 (correct for descending order)
     */

}