package class28;

import java.util.LinkedHashSet;

public class Task6 {
    public static void main(String[] args) {
        /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
         */
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("C");
        words.add("H");
        words.add("A");
        words.add("R");
        words.add("L");
        words.add("E");
        words.add("S");

        String newWord = "";
        for(var word:words) {
            newWord+=word;
        }
        System.out.println(newWord);


    }
}
