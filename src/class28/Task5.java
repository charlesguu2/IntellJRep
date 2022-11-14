package class28;

import java.util.TreeMap;

public class Task5 {
    /* Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        TreeMap<String,Integer> emp = new TreeMap<>();
        emp.put("Jaxson Polan",90000);
        emp.put("Loap Dixie",12000);
        emp.put("Pope Tertanmo",67000);
        emp.put("Iolane Nui",98000);
        emp.put("Ana Buck",43000);
        emp.put("John Smith",100000);

        var values = emp.values();
        int highest = 0;
        var highname = "";
        for(var value:values) {
            if(value > highest) {
                highest=value;
            }
        }
       var alandemp = emp.entrySet();
        for(var empandval:alandemp) {
            if(empandval.setValue(highest) == highest) {
                highname = empandval.getKey();
            }
        }
        System.out.println(highname+"=$"+highest);

    }
}
