import java.sql.*;
import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root" , "7378173");
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n--- University Database CLI ---");
                System.out.println("1. View All Students");
                System.out.println("2. Add a New Student");
                System.out.println("3. Update Student GPA");
                System.out.println("4. Delete a Student");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> viewAllStudents(conn);
                    case 2 -> addStudent(conn, scanner);
                    case 3 -> updateStudentGPA(conn, scanner);
                    case 4 -> deleteStudent(conn, scanner);
                    case 5 -> {
                        System.out.println("Exiting program...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewAllStudents(Connection conn) throws SQLException {
        String query = "SELECT student_id, name, dob, email, gpa FROM students";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n Student List");
            while (rs.next()) {
                System.out.printf("ID: %s | Name: %s | DOB: %s | Email: %s | GPA: %.2f%n",
                        rs.getString("student_id"),
                        rs.getString("name"),
                        rs.getDate("dob"),
                        rs.getString("email"),
                        rs.getFloat("gpa"));
            }
        }
    }

    private static void addStudent(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());

        String query = "INSERT INTO students (student_id, name, dob, email, gpa) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setDate(3, Date.valueOf(dob));
            pstmt.setString(4, email);
            pstmt.setFloat(5, gpa);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "Student added successfully!" : "Failed to add student.");
        }
    }

    private static void updateStudentGPA(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter New GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());

        String query = "UPDATE students SET gpa = ? WHERE student_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setFloat(1, gpa);
            pstmt.setString(2, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "GPA updated successfully!" : "Student not found.");
        }
    }

    private static void deleteStudent(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Student ID to Delete: ");
        String id = scanner.nextLine();

        String query = "DELETE FROM students WHERE student_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "Student deleted." : "Student not found.");
        }
    }
}
