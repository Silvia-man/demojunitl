package com.dharme;

import org.junit.Before;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@RunWith(JUnitPlatform.class)
public class DumbTest {
    private static Dumb dumb;

    @BeforeAll
    static void init() {
        dumb = new Dumb();
    }

    @Test
    public void testSum() {
        assertTrue(dumb.sum(1, 2, 3) == 6, "Sum should return 5");
    }


  /*  @Test
    public void groupAssertions() {
        int[] numbers = dumb.getNumbers(0,1,3,4,2,8);
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[1], 1));
    }

   */

    @Test
    public void trueAssumption() {
        assumeTrue(true);
        assertEquals(dumb.sum(5, 2), 7);
    }

    @Test
    public void assumptionThat() {
        String sys = "MAC";
        assumingThat(sys.equals("WIN"),
                () -> assertEquals(dumb.sum(2+2), 4));

        assumingThat(sys.equals("MAC"),
                () -> System.out.println("Sys valid"));
    }
}
