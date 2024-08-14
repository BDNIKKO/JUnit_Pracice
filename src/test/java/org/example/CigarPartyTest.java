package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CigarPartyTest {

    @Test
    public void testCigarParty() {
        CigarParty cigarPartyChecker = new CigarParty();

        // Test case 1: 30 cigars on a weekday -> false
        assertFalse(cigarPartyChecker.cigarParty(30, false));

        // Test case 2: 50 cigars on a weekday -> true
        assertTrue(cigarPartyChecker.cigarParty(50, false));

        // Test case 3: 70 cigars on the weekend -> true
        assertTrue(cigarPartyChecker.cigarParty(70, true));

        // Test case 4: 40 cigars on a weekday -> true
        assertTrue(cigarPartyChecker.cigarParty(40, false));

        // Test case 5: 60 cigars on a weekday -> true
        assertTrue(cigarPartyChecker.cigarParty(60, false));

        // Test case 6: 61 cigars on a weekday -> false (just above the upper bound)
        assertFalse(cigarPartyChecker.cigarParty(61, false));

        // Test case 7: 39 cigars on the weekend -> false (just below the lower bound)
        assertFalse(cigarPartyChecker.cigarParty(39, true));

        // Test case 8: 100 cigars on a weekday -> false (way above the upper bound)
        assertFalse(cigarPartyChecker.cigarParty(100, false));

        // Test case 9: 100 cigars on the weekend -> true (no upper bound)
        assertTrue(cigarPartyChecker.cigarParty(100, true));
    }
}
