package org.example;

/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 * <p>
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */

public class Diff21 {
    public int diff21(int n) {
        // Check if n is less than or equal to 21
        if (n <= 21) {
            // If n is 21 or less, return the absolute difference between 21 and n
            return 21 - n;
        } else {
            // If n is greater than 21, return double the absolute difference
            return (n - 21) * 2;
        }
    }

    // Main method to test the diff21 function
    public static void main(String[] args) {
        Diff21 diff21Checker = new Diff21();

        // Test cases to check various scenarios
        System.out.println(diff21Checker.diff21(19));  // 2, because 21 - 19 = 2
        System.out.println(diff21Checker.diff21(10));  // 11, because 21 - 10 = 11
        System.out.println(diff21Checker.diff21(21));  // 0, because 21 - 21 = 0
        System.out.println(diff21Checker.diff21(25));  // 8, because (25 - 21) * 2 = 8
    }
}
