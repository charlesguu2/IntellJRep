package class16;

public class Homework1 {

    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.

    double sumArray(int [] arr) {
        double sum=0;
        for(int num:arr) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Homework1 homework1=new Homework1();
        int [] array={10,10,80,20};
         System.out.println(homework1.sumArray(array));
    }
}
