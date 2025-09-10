package Chapter4.Exercise;

import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * @author Xhanti Solani
 * Student Grading System
 *
 */
public class StudentGradingSystem {

    // Attributes
    private String firstname;
    private String lastname;
    private int birthyear;
    private double testmark;

    // Default constructor
    public StudentGradingSystem() {}

    // Constructor
    public StudentGradingSystem(String firstname, String lastname, int birthyear, double testmark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
        this.testmark = testmark;
    }


    // Properties
    // Getters
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public double getTestmark() {
        return testmark;
    }

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public void setTestmark(double testmark) {
        this.testmark = testmark;
    }


    // Methods
    public void greeting() {
        JOptionPane.showMessageDialog(null, "Welcome to the Student Grading System!\nPlease enter your details below:");

        String name = JOptionPane.showInputDialog("Please Enter your First Name:");
        setFirstname(name);

        String lastname = JOptionPane.showInputDialog("Please Enter your Last Name:");
        setLastname(lastname);

        int birthyear = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your Birth Year:"));
        setBirthyear(birthyear);

        double testmark = Double.parseDouble(JOptionPane.showInputDialog("Please Enter your Test Mark:"));
        setTestmark(testmark);
    }



    public static String determineGrade(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }

        String grade;
        if (mark > 90)            grade = "A+";
        else if (mark >= 80)      grade = "A";
        else if (mark >= 70)      grade = "B";
        else if (mark >= 60)      grade = "C";
        else if (mark >= 50)      grade = "D";
        else if (mark >= 40)      grade = "D-";
        else                      grade = "F";
        return grade;
    }

    public int determineAge(int birthyear) {
        int currentyear = 2025;
        return  currentyear - birthyear; //

    }

    public String displayOutput() {

        String output = "";

        JOptionPane.showMessageDialog(
                null,
                "Student Details:\n" +
                        "1) First Name: " + getFirstname() + "\n" +
                        "2) Last Name: " + getLastname() + "\n" +
                        "3) Age: " + determineAge(getBirthyear()) + "\n" +
                        "4) Mark: " + getTestmark() + "\n" +
                        "5) Grade: " + determineGrade(getTestmark()) + "\n"
        );


        return output;
    }

    // The Main Program to Execute the Class
    public  static void main(String args[]){
        StudentGradingSystem student = new StudentGradingSystem();
        student.greeting();
        student.displayOutput();
    }
}
