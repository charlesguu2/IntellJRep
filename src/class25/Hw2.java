package class25;

import java.util.ArrayList;

public class Hw2 {
    //Create an arrayList of drinks.
    // If any drink has letter “a” or “e” replace it with water.

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Lemonade");
        drinks.add("fresh juice");
        drinks.add("Soda");
        drinks.add("Milk");
        drinks.add("Chocalate milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
