package Chapter1;
/**
 * @author Xhanti Solani
 * This Class demonstrates how to get input from the user
 * using dialog input
*/

import javax.swing.JOptionPane;

public class GetInputDialog {
    public static void main(String[] args) {
        // Declare variables
        String initials;
        String ageInput;
        int age;
        String heightInput;
        double height;
        String salaryInput;
        double salary;

        // Get initials
        initials = JOptionPane.showInputDialog("Please enter your initials:");

        // Get age as string and convert to integer
        ageInput = JOptionPane.showInputDialog("Please enter your age:");
        age = Integer.parseInt(ageInput);

        // Get height as string and convert to double
        heightInput = JOptionPane.showInputDialog("Please enter your height in meters:");
        height = Double.parseDouble(heightInput);

        // Get salary as string and convert to double
        salaryInput = JOptionPane.showInputDialog("Please enter your salary:");
        salary = Double.parseDouble(salaryInput);

        // Build the result message
        String message = "Your Details:\n"
                + "Initials: " + initials + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + " meters\n"
                + "Salary: R" + salary;

        // Display the message
        JOptionPane.showMessageDialog(null, message);
    }
}
