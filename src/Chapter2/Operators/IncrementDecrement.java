package Chapter2.Operators;

public class IncrementDecrement {
    public static void main(String[] args) {

        int number = 25;

        System.out.println("===============Post===============");
        //post increment / decrement
        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value of value of number by 1, but keep the priginal value: " + number++);
        System.out.println("New value of number is: " + number);
        System.out.println("Decrement the value of value of number by 1, but keep the priginal value: " + number--);
        System.out.println("New value of number is: " + number);

        System.out.println("===============Pre===============");
        //pre increment / decrement
        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value of value of number by 1, and update the value before being accessed: " + ++number);
        System.out.println("New value of number is: " + number);
        System.out.println("Decrement the value of value of number by 1, and update the value before being accessed: " + --number);
        System.out.println("New value of number is: " + number);

    }
}
