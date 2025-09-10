package Chapter3;

/**
 * @author Xhanti Solani
 * Use the doWhile when you do not know the number of iterations
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        char option = 'a';


        do {

            System.out.println("option = " + option);
            option++;

        } while (option != ('g'));
    }
}
