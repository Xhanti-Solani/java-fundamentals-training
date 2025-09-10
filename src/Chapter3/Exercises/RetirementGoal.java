package Chapter3.Exercises;

import java.util.Scanner;

/**
 * @author Xhanti
 * Retirement Plan Programme HomeWork
 */
public class RetirementGoal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yearsBeforeRetirement = 0;
        double annualSavings = 0;

        // Validate years before retirement
        do {
            System.out.print("Enter number of years before retirement: ");
            yearsBeforeRetirement = input.nextInt();

            if (yearsBeforeRetirement <= 0) {
                System.out.println("Years must be greater than 0.");
            }
        } while (yearsBeforeRetirement <= 0);

        // Validate annual savings
        do {
            System.out.print("Enter the amount you can save annually: ");
            annualSavings = input.nextDouble();

            if (annualSavings <= 0) {
                System.out.println("Amount must be greater than 0.");
            }
        } while (annualSavings <= 0);

        double totalSavings = 0;
        double currentSavings = annualSavings;

        System.out.println("\nYearly Breakdown:");
        for (int year = 1; year <= yearsBeforeRetirement; year++) {
            if (year >= 2) {
                currentSavings *= 1.10;
            }
            System.out.printf("Year %d = R%.2f%n", year, currentSavings);
            totalSavings += currentSavings;
        }

        System.out.printf("\nAt retirement, you will have saved: R%.2f%n", totalSavings);

        input.close();
    }
}
