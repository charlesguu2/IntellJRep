package class28;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        Map<String,String> countries = new LinkedHashMap<>();
        countries.put("Canada","Ontario");
        countries.put("India","Al-Haal");
        countries.put("Mexico","La Paz");
        countries.put("Russia","Moscow");
        countries.put("United States","DC");



        System.out.println("--------Both Countries and Capital With Iterator---------");
        var iterator = countries.entrySet().iterator();
        while(iterator.hasNext()) {
            var values = iterator.next();
            System.out.println(values);
        }
        System.out.println("---------Loop---------");

         var countriess = countries.entrySet();
        for(var countrie:countriess) {
            System.out.println(countrie);
        }

        System.out.println("---------------Country value with Iterator--------------------");
        var val =countries.values().iterator();
        while(val.hasNext()) {
            var va = val.next();
            System.out.println(va);
        }
        System.out.println("---------------------With Loop---------------");

        var onlycountry = countries.values();
        for(var country:onlycountry) {
            System.out.println(country);
        }







    }
}
