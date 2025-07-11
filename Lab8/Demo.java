import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Demo{

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Attendee> attendees = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== Attendee Management System ===");
            System.out.println("1. Register a new attendee");
            System.out.println("2. Remove an attendee by email");
            System.out.println("3. Search for an attendee by email");
            System.out.println("4. List all attendees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = readInt();

            switch (choice) {
                case 1 -> registerAttendee();
                case 2 -> removeAttendee();
                case 3 -> searchAttendee();
                case 4 -> listAttendees();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
    private static void registerAttendee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        if (name.isEmpty() || email.isEmpty()) {
            System.out.println("Name and email cannot be empty.");
            return;
        }

        Attendee newAttendee = new Attendee(name, email);
        if (attendees.contains(newAttendee)) {
            System.out.println("Attendee with this email already exists.");
        } else {
            attendees.add(newAttendee);
            System.out.println("Attendee registered successfully.");
        }
    }

    private static void removeAttendee() {
        System.out.print("Enter email of attendee to remove: ");
        String email = scanner.nextLine().trim();

        Attendee temp = new Attendee("", email);
        if (attendees.remove(temp)) {
            System.out.println("Attendee removed successfully.");
        } else {
            System.out.println("Attendee not found.");
        }
    }

    private static void searchAttendee() {
        System.out.print("Enter email to search: ");
        String email = scanner.nextLine().trim();

        for (Attendee attendee : attendees) {
            if (attendee.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Attendee found: " + attendee);
                return;
            }
        }
        System.out.println("Attendee not found.");
    }

    private static void listAttendees() {
        if (attendees.isEmpty()) {
            System.out.println("No attendees registered.");
            return;
        }

        attendees.sort(Comparator.comparing(Attendee::getName));
        System.out.println("=== Attendee List ===");
        for (Attendee attendee : attendees) {
            System.out.println(attendee);
        }
    }

    private static int readInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
