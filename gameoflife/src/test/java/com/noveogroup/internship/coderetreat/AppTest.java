package com.noveogroup.internship.coderetreat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AppTest {

    @Test
    public void testEquals() {

        // Passes
        assertEquals(Main.getCount(), 5);

        // Fails
        assertEquals(Main.getCount(), 4);
    }

    @Test
    public void test() {
        // Passes
        assertTrue(Main.getCount() > 2);
    }
}
