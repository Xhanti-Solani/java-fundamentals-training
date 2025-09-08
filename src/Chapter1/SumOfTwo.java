package Chapter1;
import java.util.Scanner;

public class SumOfTwo {

    public class Question2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt user for two numbers
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            // Calculate sum
            double sum = num1 + num2;

            // Display result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            input.close();
        }
    }

}
