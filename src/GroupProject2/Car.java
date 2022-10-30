package GroupProject2;
/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
a price of the car. Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of
calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then returned pricecar should include 10% discount,
otherwise 20% discount. The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5% discount, otherwise 10% discount
    */
public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice=carPrice;
        this.color=color;
    }

    public void carPrice() {
        System.out.println(carPrice);
    }
    public abstract double calculateSalePrice();

}
class Sedan extends Car {
    int length;

    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

@Override
    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice - (carPrice * 0.05);
        } else {
            return carPrice - (carPrice * 0.1);
        }
    }
}
class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 0.2);
        } else {
            return carPrice - (carPrice * 0.1);
        }
    }
}