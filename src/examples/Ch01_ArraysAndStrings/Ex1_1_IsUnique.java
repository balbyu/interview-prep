package examples.Ch01_ArraysAndStrings;

import java.util.Arrays;

/**
 * examples.Ch01_ArraysAndStrings.Ex1_1_IsUnique
 * 
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class Ex1_1_IsUnique {

    public static void main(String[] args) {
        
    }

    /**
     * This method tests whether a word contains all unique characters using a more efficient solution.
     * @param word the String to test
     * @return true if all characters are unique, false if there are repeated characters
     */
    public static boolean isUniqueBetterSolution(String word){
        char[] chArray = word.toCharArray(); 
  
        // Using sorting 
        // Arrays.sort() uses binarySort in the background 
        // for non-primitives which is of O(nlogn) time complexity 
        Arrays.sort(chArray); 
  
        for (int i = 0; i < chArray.length - 1; i++) { 
            // if the adjacent elements are not 
            // equal, move to next element 
            if (chArray[i] == chArray[i + 1]) {

                // if at any time, 2 adjacent elements
                // become equal, return false
                return false;
            }
        }
        return true; 
            
    }

    /**
     * This method tests whether a word contains all unique characters using a brute force method.
     * @param word the String to test
     * @return true if all characters are unique, false if there are repeated characters
     */
    public static boolean isUniqueBruteForce(String word){

        // If at any time we encounter 2 same 
        // characters, return false 
        for (int i = 0; i < word.length(); i++) 
            for (int j = i + 1; j < word.length(); j++) 
                if (word.charAt(i) == word.charAt(j)) 
                    return false; 
  
        // If no duplicate characters encountered, 
        // return true 
        return true; 
    }  
}