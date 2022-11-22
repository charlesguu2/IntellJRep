package ReplsPractice;

import java.util.*;

public class number197 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList=new ArrayList<>();
        Map<String, Object> appleMap=new HashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);

        Map<String, Object> OrangeMap=new HashMap<>();
        OrangeMap.put("Items","Orange");
        OrangeMap.put("Price",21.99);
        OrangeMap.put("Quantity",10.0);

        dataList.add(appleMap);
        dataList.add(OrangeMap);

        double price=0;
        double quantity=0;
        double total=0;
        for(Map<String,Object> listData:dataList) {
            for(Map.Entry<String,Object> entry:listData.entrySet()) {

                 if(entry.getKey().equals("Price")) {
                   //  price=Double.parseDouble(entry.getValue().toString());
                     price=(double) entry.getValue();
                 }
                 else if(entry.getKey().equals("Quantity")) {
                      quantity=(double) entry.getValue();
                }

                System.out.print(entry.getKey()+": "+entry.getValue()+" ");


            }
             total+=price * quantity;
            System.out.println("SubTotal "+(price*quantity));
        }
        System.out.println("You purchased total :"+(total));



    }
}


