package org.example;

/**
 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars
 * is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise.
 * <p>
 * cigarParty(30, false) → false
 * cigarParty(50, false) → true
 * cigarParty(70, true) → true
 */

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        // Check if it is the weekend
        if (isWeekend) {
            // On weekends, the number of cigars should be at least 40
            return cigars >= 40;
        } else {
            // On weekdays, the number of cigars should be between 40 and 60 inclusive
            return cigars >= 40 && cigars <= 60;
        }
    }

    // Main method to test the cigarParty function
    public static void main(String[] args) {
        CigarParty cigarPartyChecker = new CigarParty();

        // Test cases to check various scenarios
        System.out.println(cigarPartyChecker.cigarParty(30, false)); // false, not enough cigars on a weekday
        System.out.println(cigarPartyChecker.cigarParty(50, false)); // true, cigars are within the range on a weekday
        System.out.println(cigarPartyChecker.cigarParty(70, true));  // true, no upper bound on the weekend
    }
}
