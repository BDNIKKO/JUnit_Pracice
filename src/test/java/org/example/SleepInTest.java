package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SleepInTest {

    @Test
    public void testSleepIn() {
        SleepIn sleepInChecker = new SleepIn();

        // Test case 1: Not a weekday and not on vacation -> should sleep in
        assertTrue(sleepInChecker.sleepIn(false, false));

        // Test case 2: It is a weekday and not on vacation -> should not sleep in
        assertFalse(sleepInChecker.sleepIn(true, false));

        // Test case 3: Not a weekday but on vacation -> should sleep in
        assertTrue(sleepInChecker.sleepIn(false, true));

        // Test case 4: It is a weekday but on vacation -> should sleep in
        assertTrue(sleepInChecker.sleepIn(true, true));
    }
}
