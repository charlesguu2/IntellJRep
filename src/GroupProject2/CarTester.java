package GroupProject2;

public class CarTester {

    public static void main(String[] args) {
     Sedan s = new Sedan(54000,"Green",15);
     double salePrice = s.calculateSalePrice();
     System.out.println(salePrice);

     Truck t = new Truck(21000,"Red",22);
     double salePrice1 = t.calculateSalePrice();
     System.out.println(salePrice1);

    }
}
