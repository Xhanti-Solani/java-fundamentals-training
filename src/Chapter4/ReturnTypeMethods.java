package Chapter4;

import java.util.Scanner;

/**
 * @author Xhanti Solani
 */
public class ReturnTypeMethods {
    public static void main(String[] args) {


    }

    public static String getAddress(){
        return "123 Main Street";
    }

    public static int getSum(){
        int num1 = 5;
        int num2 = 15;
        int sum = num1 + num2;

        return sum;
    }

    public static Scanner getPen(){
        return new Scanner(System.in);
    }

    public boolean isEven() {
        int num = 12;
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
