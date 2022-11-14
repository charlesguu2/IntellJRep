package class28;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        /* Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
         */
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(21);
        ints.add(50);
        ints.add(12);
        ints.add(5);
        ints.add(9);
        ints.add(5);
        ints.add(9);

        int total = 0;
        for(var integer:ints) {
            total+=integer;
        }
        System.out.println(total);

}
}