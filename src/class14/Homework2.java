package class14;

public class Homework2 {
    //Create a method that will take a number
    // and prints whether the number is even or odd.

    boolean EvenOrOdd(int x) {
        if(x%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Homework2 hw=new Homework2();
        if(hw.EvenOrOdd(90)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
