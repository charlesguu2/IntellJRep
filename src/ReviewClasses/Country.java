package ReviewClasses;

public class Country {
    public String name;
    protected String capital;
    int population;
    private String president;

    //public Country(){
       // System.out.println("Country class constructor");
    //}

    public Country(String name){
        this.name=name;
    }
}
class Peru extends Country {

    Peru(String name){
        super(name);
    }
    double salary;
    /* Peru() {
         super();
        }
       */

    public static void main(String[] args) {

          Peru p = new Peru("Peru");
          p.name="Peru";
          p.capital="Lima";
          p.population=22000000;
          p.salary=1000;

          //p.president - not accessible because it is private

    }
}
