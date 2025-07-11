package task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Menu {
    private static ArrayList<String> watchlist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getIntInput("Choose an option: ");

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    searchMovie();
                    break;
                case 4:
                    displayMovies();
                    break;
                case 5:
                    sortMovies();
                    break;
                case 6:
                    System.out.println("Exiting. Goodbye, Ted!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println(); // spacing between operations

        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("=== Ted Mosby’s Movie Watchlist Manager ===");
        System.out.println("1. Add a movie");
        System.out.println("2. Remove a movie");
        System.out.println("3. Search for a movie");
        System.out.println("4. Display all movies");
        System.out.println("5. Sort the list alphabetically");
        System.out.println("6. Exit");
    }

    private static void addMovie() {
        System.out.print("Enter movie title to add: ");
        String title = scanner.nextLine().trim();

        if (isMovieInList(title)) {
            System.out.println("Movie already in the watchlist!");
        } else {
            watchlist.add(title);
            System.out.println("Movie added successfully.");
        }
    }

    private static void removeMovie() {
        System.out.print("Enter movie title to remove: ");
        String title = scanner.nextLine().trim();

        int index = getMovieIndex(title);
        if (index != -1) {
            watchlist.remove(index);
            System.out.println("Movie removed successfully.");
        } else {
            System.out.println("Movie not found in the watchlist.");
        }
    }

    private static void searchMovie() {
        System.out.print("Enter movie title to search: ");
        String title = scanner.nextLine().trim();

        if (isMovieInList(title)) {
            System.out.println("Movie is in the watchlist.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void displayMovies() {
        if (watchlist.isEmpty()) {
            System.out.println("No movies in the watchlist.");
        } else {
            System.out.println("Your Watchlist:");
            for (int i = 0; i < watchlist.size(); i++) {
                System.out.println((i + 1) + ". " + watchlist.get(i));
            }
        }
    }

    private static void sortMovies() {
        if (watchlist.isEmpty()) {
            System.out.println("Watchlist is empty. Nothing to sort.");
        } else {
            Collections.sort(watchlist, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Movies sorted alphabetically.");
        }
    }

    private static boolean isMovieInList(String title) {
        return getMovieIndex(title) != -1;
    }

    private static int getMovieIndex(String title) {
        for (int i = 0; i < watchlist.size(); i++) {
            if (watchlist.get(i).equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    private static int getIntInput(String prompt) {
        int num;
        while (true) {
            System.out.print(prompt);
            try {
                num = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
            }
        }
        return num;
    }
}
