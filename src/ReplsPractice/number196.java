package ReplsPractice;

import java.util.HashMap;
import java.util.Map;

public class number196 {
    static void Display(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.print("map is empty");
        } else {
         var values = map.entrySet();
            for (var value: values
                 ) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("mango",10);
        map.put("apple",30);
        map.put("orange",20);
        Display(map);
        map.clear();
        Display(map);



    }
}
