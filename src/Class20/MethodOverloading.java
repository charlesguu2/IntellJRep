package Class20;

public class MethodOverloading {

    double dNumber;

    MethodOverloading(){

    }

    MethodOverloading(double dNumber){
        this.dNumber = dNumber;
    }

    MethodOverloading(int dNumber){
        this.dNumber = dNumber;
    }

    static void add(int num1,int num2) {
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2,double num3) {
        System.out.println(num1 + num2 + num3);
    }


    public static void main(String[] args) {
        add(20,20);
        add(30.1,78.1);
        add(43.1,78.9,90.2);
        new MethodOverloading(43.2);
        }

    }

