package Chapter1;

public class LetterCounter {
    public static void main(String[] args) {
        String sentence = "Video provides a powerful way to help you prove your point.";

        // Remove all spaces from the sentence
        String noSpaces = sentence.replace(" ", "");

        // Count the number of characters (excluding spaces)
        int letterCount = noSpaces.length();

        // Output the result
        System.out.println("Number of letters (excluding spaces): " + letterCount);
    }
}
