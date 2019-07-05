package examples;

/**
 * examples.Ex1_2
 * 
 * Given two strings, write a method to decide if one is a isPermutation of the
 * other.
 */
public class Ex1_2 {

    /**
     * Determines whether or not Word One is a permutation of Word Two.
     * @param wordOne - Word One
     * @param wordTwo - Word Two
     * @return true if word one is a permutation of word two, otherwise false
     */
    public static boolean isPermutation(String wordOne, String wordTwo) {
        wordOne = wordOne.toLowerCase();
        wordTwo = wordTwo.toLowerCase();

        return sortString(wordOne).equals(sortString(wordTwo));
    }

    /**
     * Sorts the provided string into ascending order using Java Arrays.
     * @param string - string to sort
     * @return sorted string
     */
    private static String sortString(String string) {
        char[] charArray = string.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
}