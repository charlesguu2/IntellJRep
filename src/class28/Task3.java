package class28;

import java.util.LinkedHashMap;

public class Task3 {
    /* Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> bestBuyStore = new LinkedHashMap<>();
        bestBuyStore.put(33390, "Controller");
        bestBuyStore.put(45900, "Mouse");
        bestBuyStore.put(98123, "Nintendo");
        bestBuyStore.put(78889, "PS4");
        bestBuyStore.put(34907, "PC");

        var items = bestBuyStore.entrySet();
        for (var item : items) {
            System.out.println(item);

        }
    }
}
