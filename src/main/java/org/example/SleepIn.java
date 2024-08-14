package org.example;

/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday/we're on vacation. Return true if we sleep in.
 * <p>
 * sleepIn(false, false) → true
 * sleepIn(true, false) → false
 * sleepIn(false, true) → true
 */

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // We need to determine if we can sleep in based on the day of the week and vacation status
        // If it's not a weekday (weekday is false) or we are on vacation (vacation is true), we can sleep in
        return !weekday || vacation;
        // If it's a weekday/we are not on vacation; we cannot sleep in
        //  IntelliJ had me simplify my 'if' statement

    }

    // Main method to test the sleepIn function
    public static void main(String[] args) {
        SleepIn sleepInChecker = new SleepIn();

        // Test cases to check various scenarios
        System.out.println(sleepInChecker.sleepIn(false, false)); // true, it's not a weekday and not on vacation
        System.out.println(sleepInChecker.sleepIn(true, false));  // false, it's a weekday and not on vacation
        System.out.println(sleepInChecker.sleepIn(false, true));  // true, it's not a weekday but on vacation
    }
}
