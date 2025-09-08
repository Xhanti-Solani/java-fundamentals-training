package Chapter1;

import java.util.Scanner;

public class UsingConstants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable declarations
        int age;
        double height;
        float salary;
        boolean isMarried = true;
        char initial;
        String firstname;

        // Input from user
        System.out.print("Please enter your initial: ");
        initial = sc.next().charAt(0);

        System.out.print("Please enter your name: ");
        firstname = sc.next();

        System.out.print("Please enter age: ");
        age = sc.nextInt();

        System.out.print("Please enter height: ");
        height = sc.nextDouble();

        System.out.print("Please enter salary: ");
        salary = sc.nextFloat();

        // Output details
        System.out.println("\n========== Details ==========");
        System.out.println("Initial: " + initial);
        System.out.println("Name: " + firstname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Married?: " + isMarried);

        sc.close();
    }
}
