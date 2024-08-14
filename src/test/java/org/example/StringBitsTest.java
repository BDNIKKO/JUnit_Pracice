package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringBitsTest {

    @Test
    public void testStringBits() {
        StringBits stringBitsChecker = new StringBits();

        // Test case 1: "Hello" -> "Hlo"
        assertEquals("Hlo", stringBitsChecker.stringBits("Hello"));

        // Test case 2: "Hi" -> "H"
        assertEquals("H", stringBitsChecker.stringBits("Hi"));

        // Test case 3: "Heeololeo" -> "Hello"
        assertEquals("Hello", stringBitsChecker.stringBits("Heeololeo"));

        // Test case 4: Empty string -> ""
        assertEquals("", stringBitsChecker.stringBits(""));

        // Test case 5: Single character string -> same single character
        assertEquals("H", stringBitsChecker.stringBits("H"));

        // Test case 6: Two character string -> first character
        assertEquals("H", stringBitsChecker.stringBits("Hi"));

        // Test case 7: String with even number of characters -> every other character
        assertEquals("Hlo", stringBitsChecker.stringBits("Hello!"));
    }
}
