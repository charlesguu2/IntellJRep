package Class20;

public class Hw1 {
   /* Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box */

    void add(int length,int width) {
        System.out.println("The area of this shape is "+length*width);
    }
    void add(int length){
        System.out.println("The area of this shape is "+length*length);
    }
    void addVolume(int length,int width,int height){
        System.out.println("The volume is "+length*width*height);
    }
}
class Tester {
    public static void main(String[] args) {
        new Hw1().add(30,21);
        new Hw1().add(21);
        new Hw1().addVolume(21,3,43);
    }
}
