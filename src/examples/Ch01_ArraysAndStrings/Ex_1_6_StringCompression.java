package examples.Ch01_ArraysAndStrings;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Implement a a method to perform basic string compression using the counts of repeated characters.
 *
 * i.e. aabcccccaaa would become a2b1c5a3
 */
public class Ex_1_6_StringCompression {

    public static String getStringCompression(String word){

        //Get rid of spaces and turn into all lower case
        word = word.toLowerCase();
        word = word.replaceAll(" ", "");

        //Map the string to all unique counts of itself
        Map<String, Long> wordMap = word
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        StringBuilder builder = new StringBuilder();

        //Filter out all duplicate letters
        StringBuilder filtered = new StringBuilder();
        word.chars().distinct().forEach(c -> filtered.append((char) c));

        for(char letter : filtered.toString().toCharArray()){
            //Add letter and the count of the letter
            builder.append(letter);
            builder.append(wordMap.get(String.valueOf(letter)));
        }

        return builder.toString();
    }


    public static String getStringCompressionSimpler(String word){
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < word.length(); i++) {
            countConsecutive++;

            if(i + 1 >= word.length() || word.charAt(i) != word.charAt(i + 1)){
                compressed.append(word.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < word.length() ? compressed.toString() : word;
    }
}
