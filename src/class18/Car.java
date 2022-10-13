package class18;



public class Car {
    // Common class has many different names like parent class super class base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    // if a field or method has a private modifier in parent class child classes cannot be used
    private String engineType;

    void printCarDetails() {
        System.out.println("Model " + model + " Make " + make + " Color " + color);
    }
}

    class Bmw extends Car {
         // child classes base classes
        double engineCC;

    }


    class Tesla extends Car {

    }

    class Toyota extends Car {
        double engineCC;
        double price;
    }

    class CarTester {
        public static void main(String[] args) {
            Bmw bmw = new Bmw();
            bmw.make = "BMW";
            bmw.color="Black";
            bmw.model="x8";
            bmw.engineCC=500;
            bmw.printCarDetails();
        }
    }


