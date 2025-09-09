package Chapter3.Exercises;

import java.util.Scanner;

/**
 * @author Xhanti Solani
 * Retirement Plan Programme
 */
public class RetirementGoal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yearsBeforeRetirement = 0;
        double annualSavings = 0;

        do{
            System.out.print("Enter number of years before retirement: ");

            yearsBeforeRetirement = input.nextInt();

        } while (yearsBeforeRetirement <= 0);


            if (yearsBeforeRetirement <= 0) {
                System.out.println("Years must be greater than 0.");
            }

        while (annualSavings <= 0) {
            System.out.print("Enter the amount you can save annually: ");

            annualSavings = input.nextDouble();

            if (annualSavings <= 0) {
                System.out.println("Amount must be greater than 0.");
            }
        }


        double retirementAmount = yearsBeforeRetirement * annualSavings;

        System.out.println("\nAt retirement, you will have saved: R" + retirementAmount);

        input.close();
    }

}
