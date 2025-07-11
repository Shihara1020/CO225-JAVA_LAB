public class StudentProfile {
    private String studentId;
    private String firstName;
    private String lastName;
    private int score;
    private int activeEngagementTime;


    public StudentProfile(String studentId, String firstName, String lastName, int score, int activeEngagementTime) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.activeEngagementTime = activeEngagementTime;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getScore() {
        return score;
    }
    public int getActiveEngagementTime() {
        return activeEngagementTime;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setActiveEngagementTime(int activeEngagementTime) {
        this.activeEngagementTime = activeEngagementTime;
    }

    @Override
    public String toString() {
        return studentId + ", " + firstName + " " + lastName + ", Score: " + score +", Engagement Time: " + activeEngagementTime + " mins";
    }
}
