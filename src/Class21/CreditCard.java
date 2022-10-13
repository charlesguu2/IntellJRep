package Class21;

public class CreditCard {
    /* Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest
    based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
     int balance=10000;
     double interest=2.0;

    void calculation(){
        System.out.println("Your balance is "+balance+" so your interest will be "+interest+"%");
    }

    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.calculation();
        Visa vs=new Visa();
        vs.calculation();
        AX a=new AX();
        a.calculation();

    }
}
class Visa extends CreditCard{

}

class AX extends CreditCard{

    void calculation(){
        System.out.println("Your balance is "+balance*10+" so your interest will be "+(interest+1.5)+"%");
    }
}
