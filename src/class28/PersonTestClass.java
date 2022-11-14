package class28;
import java.util.TreeMap;

public class PersonTestClass {
    public static void main(String[] args) {

        TreeMap<String,Person> person = new TreeMap<>();
        person.put("A12",new Person("Josh","B",21,12000));
        person.put("A10",new Person("Jack","D",56,30000));
        person.put("A11",new Person("Jane","E",22,10000));
        person.put("A21",new Person("Jimo","Z",90,190000));

        for(var keys:person.keySet()) {
            System.out.println("These are the IDs: "+keys);
        }
        for( var key:person.values()) {
            System.out.println("Class values are: "+key.toString());
        }
    }
}
