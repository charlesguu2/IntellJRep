package class14;

public class Homework4 {

    //Create a method that will say Hello in different language
    // based on the country that will pass when method is executed

    void difLan(String language) {
        switch (language) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
        }

        }



    public static void main(String[] args) {
        Homework4 hw=new Homework4();
        hw.difLan("French");
    }



}
