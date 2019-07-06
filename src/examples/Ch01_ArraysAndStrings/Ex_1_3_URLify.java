package examples.Ch01_ArraysAndStrings;

/**
 * Replace all spaces in a string with %20 assuming that the string has enough space at the end
 * and we are give the true length of all word characters.
 */
public class Ex_1_3_URLify {
    /**
     * Returns the URL-ified word recursively taking O(2^word.count) run time.
     * @param word - String of the word to be turned into URL
     * @return URLified word
     */
    public static String getUrlifyRecursive(String word){
        if(!word.contains(" ")) return word;

        char[] array = word.toCharArray();
        String tempWord = null;

        for (int i = 0; i < array.length; i++) {

            if(Character.isWhitespace(array[i])){

                //Get pre/post insertion words and sandwich a %20 between them
                tempWord = getUrlifyRecursive(String.valueOf(array, 0, i)
                        .concat("%20")
                        .concat(String.valueOf(array, i+1, array.length - (i + 1))));
            }
        }
        return tempWord;
    }
}
