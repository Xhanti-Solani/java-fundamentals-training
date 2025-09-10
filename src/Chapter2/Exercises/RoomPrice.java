package Chapter2.Exercises;

/** * @author Xhanti Solani
 * This program asks for the user to enter A B C for roomType
 * Then it asks the user again to select viewType
 * Then the program displays the price in a messageBox
 */

import javax.swing.JOptionPane;

public class RoomPrice {
    public static void main(String[] args) {

        // Attributes
        double price = 0.0;
        String roomType;
        String viewType;

        // Ask for room type
        while (true) {
            roomType = JOptionPane.showInputDialog(
                    "Please choose a room type:\n" +
                            "A) Queen Bed ($125)\n" +
                            "B) King Bed ($139)\n" +
                            "C) King Bed + Pullout Couch ($165)"
            );


            // prepare input for swicth statement
            roomType = roomType.trim().toUpperCase();

            switch (roomType) {
                case "A":
                    price = 125;
                    break;
                case "B":
                    price = 139;
                    break;
                case "C":
                    price = 165;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid room type, please try again.");
                    continue; // restart the loop
            }

            // exit loop once a valid choice is made
            break;
        }

        // Ask for view type
        while (true) {
            viewType = JOptionPane.showInputDialog(
                    "Please choose a view type:\n" +
                            "1) Lake View (+$15)\n" +
                            "2) Park View"
            );

            viewType = viewType.trim();

            switch (viewType) {
                case "1":
                    price += 15;
                    break;
                case "2":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid view type, please try again.");
                    continue; // restart loop to ask again
            }
            // exit loop once valid input is given
            break;
        }

        // Display output
        JOptionPane.showMessageDialog(null, "The total price of your room is: $" + price);
    }
}
