package Chapter3;

/**
 * @author Xhanti Solani
 * use the for loop for when you know the number of times
 * the loop should execute
 */

public class ForLoop {
    public static void main(String[] args) {
        //Display java 5 times
        for(int x = 1; x <= 5; x++){
            System.out.println( x + " - Java");
        }


        System.out.println("==========Multiple Conditions============");
        // multiple conditions
        for(int x = 1, y = 5; x < 10 && y >= 0; x++, y--){
            System.out.println( x + " <-------> " + y);
        }




    }
}
