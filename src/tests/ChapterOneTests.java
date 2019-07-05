package tests;

import examples.Ex1_1;
import examples.Ex1_2;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChapterOneTests {

    @Test
    public void testExampleOne() {
        assertFalse(Ex1_1.isUniqueBruteForce("Russell"));
        assertTrue(Ex1_1.isUniqueBruteForce("Rodger"));

        assertFalse(Ex1_1.isUniqueBetterSolution("Poppa John"));
        assertTrue(Ex1_1.isUniqueBetterSolution("Rodger"));
    }

    @Test
    public void testExampleTwo() {
        assertTrue(Ex1_2.isPermutation("who", "hwo"));
        assertFalse(Ex1_2.isPermutation("requiem", "secular"));
    }
}

