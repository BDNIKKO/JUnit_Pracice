package org.example;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * <p>
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class StringBits {
    public String stringBits(String str) {
        // Initialize an empty string to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the string, starting at index 0 and incrementing by 2 to get every other character
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        // Return the final string containing every other character
        return result.toString();
    }

    // Main method to test the stringBits function
    public static void main(String[] args) {
        StringBits stringBitsChecker = new StringBits();

        // Test cases to check various scenarios
        System.out.println(stringBitsChecker.stringBits("Hello"));    // "Hlo", because every other character is "Hlo"
        System.out.println(stringBitsChecker.stringBits("Hi"));       // "H", because every other character is "H"
        System.out.println(stringBitsChecker.stringBits("Heeololeo")); // "Hello", because every other character is "Hello"
    }
}
