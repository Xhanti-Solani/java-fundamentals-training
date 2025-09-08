package Chapter1;

public class ExploreStrings {

    public static void main(String[] args) {
        String firstname = "John";  // Added a sample value for demonstration
        String lastname = "Smith";
        String sentence = "Today is Monday";

        System.out.println(firstname + " has " + firstname.length() + " letters.");
        System.out.println("'m' is found at position (index): " + lastname.indexOf('m'));
        System.out.println("Is 'smith' equal to " + lastname + "? " + lastname.equals("smith"));
        System.out.println("The third letter from " + firstname + " is: " + firstname.charAt(2));
        System.out.println("The last position of 'h' in " + lastname + " is: " + lastname.lastIndexOf('h'));
    }
}
