package Class21;

public class CreditCard {
    /* Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest
    based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
     double balance=10000;
     double interest=2.0;

     CreditCard(double balance, double interest){
         this.balance=balance;
         this.interest=interest;
     }
    void calculation(){
       double InterestAmount=interest*balance/100;
        System.out.println("Interest "+(InterestAmount));
    }

}
class Visa extends CreditCard{
    Visa(double balance, double interest){
        super(balance,interest);
    }

}
class AX extends CreditCard{
    AX(double balance, double interest){
        super(balance,interest);
    }
    void calculation(){
        double InterestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest "+(InterestAmount+10));
    }
}
