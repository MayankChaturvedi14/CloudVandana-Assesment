import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close(); // Close the scanner when done.
    }

    public static boolean isPangram(String sentence) {
        // Create an array to mark the presence of each letter (a-z)
        boolean[] letters = new boolean[26];
        int letterCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    letterCount++;
                }

                if (letterCount == 26) {
                    return true; // All letters are present
                }
            }
        }

        return false; // Not all letters are present
    }
}
