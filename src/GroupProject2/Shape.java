package GroupProject2;

interface Shape {
     void calculateArea();

    void calculatePerimeter();


}
class Circle implements Shape {
     @Override
     public void calculateArea() {
         System.out.println("The formula for the area of a circle is 3.14 * r^2");
     }
     @Override
     public void calculatePerimeter() {
         System.out.println("The formula for the perimeter of a circle is 2 * 3.14 * r ");
     }
 }
 class Square implements Shape {
    public void calculateArea() {
        System.out.println("The formula for the area of a Square is s^2");
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The formula for the perimeter of a square is 4 * s");
    }

}
