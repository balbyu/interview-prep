package examples.Ch01_ArraysAndStrings;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome (a word, phrase,
 * or sequence that reads the same backward as forward). This is not just limited to dictionary words.
 *
 * INPUT: Tact Coa
 *
 * OUTPUT: True (permutations: "taco cat", "atco eta")
 */
public class Ex_1_4_PalindromePermutation {
    /**
     * Checks to see if a the provided word is a permutation of a palindrome.
     * @param word - Word to check
     * @return true if the word is a permutation of a palindrome, false otherwise
     */
    public static boolean isPalindromePermutation(String word){

        //Get rid of spaces and turn into all lower case
        word = word.toLowerCase();
        word = word.replaceAll(" ", "");

        //Map the string to all unique counts of itself
        Map<String, Long> wordMap = word
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        //If we have two or more instances of a letter that has a single count, return false
        int count = 0;
        for (Long value : wordMap.values()){
            if(value == 1){
                count++;
            }
        }

        return count < 2;
    }
}
