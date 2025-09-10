package Chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* @author Xhanti Solani
*
*/
public class ParameterizedMethods {
    public static void main(String[] args) {
        displayMessage("Today is Wednesday");
        displayDetails("Xhanti", 24, 178.88, 6000);

        System.out.println("\n Sum: " + getSum(50,50));
        System.out.println("We have " + calcSum(3,4,5,6,6) + " numbers");
    }
    public static void displayMessage(String message){
        System.out.println(message);
    }
    public static  int getSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void displayDetails(String name, int age, double height, float salary){
        System.out.println(name+" "+age+" "+height+" "+salary);
    }

    public static double calcSum(double... numbers){
        return Arrays.stream(numbers).sum();
    }
}


