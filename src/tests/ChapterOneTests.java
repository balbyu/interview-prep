package tests;

import examples.Ch01_ArraysAndStrings.Ex1_1_IsUnique;
import examples.Ch01_ArraysAndStrings.Ex1_2_CheckPermutation;
import examples.Ch01_ArraysAndStrings.Ex_1_3_URLify;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * All unit tests for Chapter One - Arrays and Strings
 */
public class ChapterOneTests {

    @Test
    public void testExampleOne() {
        assertFalse(Ex1_1_IsUnique.isUniqueBruteForce("Russell"));
        assertTrue(Ex1_1_IsUnique.isUniqueBruteForce("Rodger"));

        assertFalse(Ex1_1_IsUnique.isUniqueBetterSolution("Poppa John"));
        assertTrue(Ex1_1_IsUnique.isUniqueBetterSolution("Rodger"));
    }

    @Test
    public void testExampleTwo() {
        assertTrue(Ex1_2_CheckPermutation.isPermutation("who", "hwo"));
        assertFalse(Ex1_2_CheckPermutation.isPermutation("requiem", "secular"));
    }

    @Test
    public void testExampleThree(){
        assertEquals("Mr%20John%20Smith", Ex_1_3_URLify.getUrlifyRecursive("Mr John Smith"));
        assertEquals("%20Hello%20", Ex_1_3_URLify.getUrlifyRecursive(" Hello "));
    }
}

