package Class21;

public class Degree {
    /*  Create a class 'Degree' having a method 'getPrerequisite' that prints "V"."To get a degree you need high school diploma".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes. */

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

    public static void main(String[] args) {
        Degree dg1=new Degree();
        dg1.getPrerequisite();
        Bachelors bc1=new Bachelors();
        bc1.getPrerequisite();
        Masters ms1=new Masters();
        ms1.getPrerequisite();
    }
}
class Bachelors extends Degree{

}

class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need to go to college for 6 years");
    }
}
