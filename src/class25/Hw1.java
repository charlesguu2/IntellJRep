package class25;

import java.util.ArrayList;

public class Hw1 {
    public static void main(String[] args) {
        /*Create an arrayList of words. Remove every word that ends with “e”  */

        ArrayList<String> words = new ArrayList<String>();
        words.add("Syntax");
        words.add("Cats");
        words.add("Remote");
        words.add("Doge");
        words.add("Tacos");

        var iterator=words.iterator();

          while(iterator.hasNext()) {
              var item=iterator.next();
              if(item.endsWith("e")) {
                  iterator.remove();
              }
          }
        System.out.println(words);



    }
}
