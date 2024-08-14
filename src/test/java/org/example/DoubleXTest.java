package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class DoubleXTest {

    @Test
    public void testDoubleX() {
        DoubleX doubleXChecker = new DoubleX();

        // Test case 1: the first "x" is followed by another "x"
        assertTrue(doubleXChecker.doubleX("axxbb"));

        // Test case 2: the first "x" is not followed by another "x"
        assertFalse(doubleXChecker.doubleX("axaxax"));

        // Test case 3: the first "x" is followed by another "x" and more "x"s
        assertTrue(doubleXChecker.doubleX("xxxxx"));

        // Test case 4: no "x" in the string
        assertFalse(doubleXChecker.doubleX("abc"));

        // Test case 5: only one "x" in the string
        assertFalse(doubleXChecker.doubleX("ax"));

        // Test case 6: first "x" is at the end of the string
        assertFalse(doubleXChecker.doubleX("abcx"));
    }
}
