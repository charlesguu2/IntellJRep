package review3review3_2;

import ReviewClasses.Country;

public class USA extends Country {
    USA(String name){
        super(name);
    }

    public static void main(String[] args) {
        USA us=new USA("USA");
        us.name="USA"; // public
        us.capital="DC"; // protected


    }
}
