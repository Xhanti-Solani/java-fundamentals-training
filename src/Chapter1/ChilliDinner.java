package Chapter1;

import java.util.Scanner;

public class ChilliDinner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prices
        final double ADULT_PRICE = 50.00;
        final double CHILD_PRICE = 37.50;

        // Ask for number of meals
        System.out.print("Enter number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter number of children’s meals: ");
        int childMeals = input.nextInt();

        // Calculate totals
        double totalAdult = adultMeals * ADULT_PRICE;
        double totalChild = childMeals * CHILD_PRICE;
        double totalAll = totalAdult + totalChild;

        // Display results
        System.out.println("\n--- Fundraiser Summary ---");
        System.out.println("Total collected from adult meals: R" + totalAdult);
        System.out.println("Total collected from children’s meals: R" + totalChild);
        System.out.println("Total collected from all meals: R" + totalAll);

        input.close();
    }
}
