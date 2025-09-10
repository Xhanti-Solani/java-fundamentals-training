package Chapter3;

/**
 * @author Xhanti Solani
 * Break: end || exit the loop
 * continue will skip current iteration and start with the next
 */
public class TerminationTechniques {
    public static void main(String[] args){

//        // break: exit || end loop
//        for(int i = 0; i < 20; i++){
//            System.out.println("i = " + i);
//            if(i ==5) break;
//        }

        // Continue: skip the current iteration
        System.out.println("===== First Loop (skip multiples of 3) =====");

        for (int i = 0; i < 20; i++) {
            // Skip numbers divisible by 3
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n===== Second Loop (stop at 5, skip 3) =====");

        for (int i = 0; i < 15; i++) {
            // Stop the loop completely if i == 5
            if (i == 5) {
                break;
            }
            // Skip this iteration if i == 3
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
        }





    }
}
