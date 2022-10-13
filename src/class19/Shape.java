package class19;

public class Shape {
    /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code*/

    int radius;

    Shape(int radius) {
        this.radius=radius;
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
    public void areaofr() {
        System.out.println("The area is " + (3.14 * radius * radius));
    }

}

class Tester{
    public static void main(String[] args) {
        new Circle(9).areaofr();

    }
}

