package class16;

public class Homework2 {
    //Create a method that will take a String as a parameter and returns reversed
    //String. Method should be available to all classes within your project and accessible by class name.

    public static String reverse(String word) {
        StringBuilder stringBuilder=new StringBuilder((word));
        stringBuilder.reverse();
        word=stringBuilder.toString();
        return word;
    }

    public static void main(String[] args) {
        Homework2 hw2=new Homework2();
        System.out.println(hw2.reverse("Figer"));
    }
}
