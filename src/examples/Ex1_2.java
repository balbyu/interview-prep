package examples;

import java.util.Hashtable;

/**
 * examples.Ex1_2
 * 
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 * 
 * First we need to get a map of all the permutations of the word. This will take 
 * n! times in memory. Then we can make a Hashtable and see if our target word is in
 * the keys, which takes log(n);
 */
public class Ex1_2 {

    Hashtable<String, Integer> table;

    public static void main(String[] args) {
        Ex1_2 myClass = new Ex1_2();
        String word1 = "hwo";
        String word2 = "who";
        System.out.println("Is " + word1 + " a permutation of " + word2 + "? " 
        + myClass.isPermutation(word2, word2));
    }

    public Ex1_2(){
    
    }

    public boolean isPermutation(String word1, String word2){
        table = new Hashtable<String, Integer>();
        getPermutation("", word2); 
        if(table.containsKey(word1)) return true;

        return false;
    }


    private void getPermutation(String prefix, String str) {
        int n = str.length();
        if (n == 0){
            table.put(prefix, prefix.hashCode());
        }
        else {
            for (int i = 0; i < n; i++)
                getPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}