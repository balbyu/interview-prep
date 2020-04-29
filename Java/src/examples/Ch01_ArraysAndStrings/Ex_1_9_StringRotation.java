package examples.Ch01_ArraysAndStrings;

/**
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class Ex_1_9_StringRotation {

     public static boolean isRotation(String s1, String s2) {
         int len = s1.length();
         /* Check that sl and s2 are equal length and not empty*/
         if (len == s2.length() && len > 0) {
             /* Concatenate sl and sl within new buffer */
             String s1s1 = s1 + s1;
             return s1s1.contains(s2);
             }
         return false;
         }
}
