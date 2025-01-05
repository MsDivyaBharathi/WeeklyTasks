package Day6.Q3;

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array to store the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for the day position
            System.out.print("Enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            // Print the day name
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the user enters an invalid index
            System.out.println("Invalid day position! Please enter a number between 0 and 6.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
