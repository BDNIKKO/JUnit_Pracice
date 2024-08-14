package org.example;

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * <p>
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */

public class DoubleX {
    public boolean doubleX(String str) {
        // Find the first occurrence of "x"
        int i = str.indexOf("x");

        // If there is no "x" or "x" is the last character, return false
        if (i == -1 || i == str.length() - 1) {
            return false;
        }

        // Check if the character immediately after the first "x" is also an "x"
        return str.charAt(i + 1) == 'x';
    }

    // Main method to test the doubleX function
    public static void main(String[] args) {
        DoubleX doubleXChecker = new DoubleX();

        // Test cases to check various scenarios
        System.out.println(doubleXChecker.doubleX("axxbb")); // true, the first "x" is followed by another "x"
        System.out.println(doubleXChecker.doubleX("axaxax")); // false, the first "x" is not followed by another "x"
        System.out.println(doubleXChecker.doubleX("xxxxx")); // true, the first "x" is followed by another "x"
    }
}
