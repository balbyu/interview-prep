package tests;

import examples.Ch01_ArraysAndStrings.*;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void testExampleFour(){
        assertTrue(Ex_1_4_PalindromePermutation.isPalindromePermutation("Tac o cat"));
        assertTrue(Ex_1_4_PalindromePermutation.isPalindromePermutation("Rats live on no evil star"));
        assertFalse(Ex_1_4_PalindromePermutation.isPalindromePermutation("taco cats"));
    }

    @Test
    public void testExampleFive(){
        assertTrue(Ex_1_5_OneAway.isOneAway("Tails", "Tail"));
        assertTrue(Ex_1_5_OneAway.isOneAway("Tudor", "Tudor"));
        assertTrue(Ex_1_5_OneAway.isOneAway("Farts", "Forts"));
        assertTrue(Ex_1_5_OneAway.isOneAway("Soccer", "Sccer"));
        assertFalse(Ex_1_5_OneAway.isOneAway("Ballerina", "Baller"));
    }

    @Test
    public void testExampleSix(){
        assertEquals(Ex_1_6_StringCompression.getStringCompressionSimpler("aabcccccaaa"), "a2b1c5a3");
        assertEquals(Ex_1_6_StringCompression.getStringCompressionSimpler(
                "aaaaaaaabbbccddddzzzzzzzzzz"),
                "a8b3c2d4z10");
    }

    @Test
    public void testExampleSeven(){
//        int [][]  scores = {  { 1, 2, 3},
//                                { 4, 5, 6 }};

        int [] [] scores = {{ 1, 2, 3, 4, 5 ,6},
                            { 7, 8, 9, 10, 11, 12 },
                            {13, 14, 15, 16, 17, 18}};

        int[][] rotateScores = Ex_1_7_RotateMatrix.rotateMatrix90Degrees(scores);

        System.out.println("Before: ");
        for (int[] row : scores)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));

        System.out.println("\n" + "After: ");
        for (int[] row : rotateScores)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}

