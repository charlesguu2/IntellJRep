package class28;

import java.util.LinkedHashMap;

public class Task1 {
    /* Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Ebay");
        building.put(4,"Amazon");
        building.put(5,"Popeyes");
        building.put(6,"Frog");
        building.put(7,"Chipotle");
        System.out.println("The size of this map is "+ building.size());
        System.out.println("The original map "+building);
        building.put(4,"Moes");
        var keyset=building.values().iterator();
        while(keyset.hasNext()) {
           var ks=  keyset.next();
           if(ks.equals("Chipotle")) {
               keyset.remove();
           }
        }
        System.out.println("The updated map "+building);







    }
}
