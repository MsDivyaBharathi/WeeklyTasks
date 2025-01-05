package Day8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input to a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period age = Period.between(birthdate, currentDate);

        // Print the age in years, months, and days
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}

