package ReplsPractice;

import java.util.*;

public class number197 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList=new ArrayList<>();



        Map<String, Object>appleMap=new HashMap<>();
        appleMap.put("Items",(Object)"Apple" );
        appleMap.put("Price",(Object)20.00);
        appleMap.put("Quantity",(Object)10.0);

        dataList.add(appleMap);


        Map<String, Object>OrangeMap=new HashMap<>();
        OrangeMap.put("Items",(Object)"Orange" );
        OrangeMap.put("Price",(Object)21.99);
        OrangeMap.put("Quantity",(Object)10.0);

        dataList.add(OrangeMap);


    }
}


