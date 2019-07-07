package examples.Ch01_ArraysAndStrings;

/**
 * Given the three types of edits you can do to a String, write a function
 * to check if they are one or zero edits away.
 *
 * Replace: Same Length, One Different Char
 * Remove: Difference in Length = -1, One Different Char
 * Insert: Difference in Length = 1, One Different Char
 *
 * Example:
 *
 *  pale, ple -> true
 *  pales, pale -> true
 *  pale, bale -> true
 *  pale, bake -> false
 */
public class Ex_1_5_OneAway {

    public static boolean isOneAway(String wordOne, String wordTwo){

        //Same exact word so true
        if(wordOne.equals(wordTwo)) return true;

        //Difference in word is more than one character so has to be false
        if(Math.abs(wordOne.length() - wordTwo.length()) > 1) return false;

        //One edit away!
        return true;
    }
}
