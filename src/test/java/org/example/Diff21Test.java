package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Diff21Test {

    @Test
    public void testDiff21() {
        Diff21 diff21Checker = new Diff21();

        // Test case 1: n is 19 -> 2
        assertEquals(2, diff21Checker.diff21(19));

        // Test case 2: n is 10 -> 11
        assertEquals(11, diff21Checker.diff21(10));

        // Test case 3: n is 21 -> 0
        assertEquals(0, diff21Checker.diff21(21));

        // Test case 4: n is 25 -> 8
        assertEquals(8, diff21Checker.diff21(25));

        // Test case 5: n is 22 -> 2
        assertEquals(2, diff21Checker.diff21(22));

        // Test case 6: n is 0 -> 21
        assertEquals(21, diff21Checker.diff21(0));

        // Test case 7: n is 20 -> 1
        assertEquals(1, diff21Checker.diff21(20));

        // Test case 8: n is -1 -> 22 (to test behavior with negative numbers)
        assertEquals(22, diff21Checker.diff21(-1));
    }
}
