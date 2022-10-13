package class14;

public class Homework1 {
      //Create a method that will take 2 parameters
        // as a numbers and prints which number is larger.

         void twonumbers(int x,int y) {
             if(x>y) {
                 System.out.println(x+" is bigger");
             } else {
                 System.out.println(y+" is bigger");
             }
           }

    public static void main(String[] args) {
        Homework1 hw=new Homework1();
        hw.twonumbers(8,21);

    }




}
