import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInt(romanNumeral);

        if (result != -1) {
            System.out.println("Integer representation: " + result);
        } else {
            System.out.println("Invalid Roman numeral.");
        }

        // Close the scanner
        scanner.close();
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        if (isValidRoman(s)) {
            return result;
        } else {
            return -1; // Return -1 for invalid Roman numerals
        }
    }

    public static boolean isValidRoman(String s) {
        // A simple check for valid Roman numerals
        return s.matches("^[IVXLCDM]*$");
    }
}
