package Chapter4;

/**
 * @author Xhanti Solani u
 */
public class MethosOverloading {
    public static void main(String[] args) {

        System.out.println("Sum: " + calcSum(15F, 32.6F));

    }

    public static int calcSum(int num1, int num2, int num3) {
        int sum = num1 + num2  + num3;
        return sum;
    }

    public static double calcSum(double num1, int num2){
        double sum = num1 + num2;
        return sum;
    }

    public static double calcSum(int num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    /**
     * Calculate the Sum of Two Integers
     * @param num1 number 1
     * @param num2 number 2
     * @return
     */
    public static int calcSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    /**
     * Calculate the Sum of Two Double
     * @param num1 number 1
     * @param num2 number 2
     * @return
     */
    public static double calcSum(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

//    public static double calcSum(double num1, double num2){
//        double sum = num1 + num2;
//        return sum;
//    }
    /**
     * Calculate the Sum of Two Floating variables
     * @param num1 number 1
     * @param num2 number 2
     * @return
     */
    public static float calcSum(float num1, float num2){
        float sum = num1 + num2;
        return sum;
    }

}
