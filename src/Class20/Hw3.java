package Class20;

public class Hw3 {
    /* Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void mainm(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("I love soccer");
        }
    }
    static void mainm(String animal,boolean fly){
        System.out.println(animal+fly);
    }
    static void mainm(double num1,String word1){
        System.out.println("Age: "+num1+" Name: "+word1);
    }
    static void mainm() {
        System.out.println("I love Java");
    }

    public static void main(String[] args) {
        mainm("horse",true);
        mainm(2);
        mainm();
        mainm(3,"Jon");
    }
        }

