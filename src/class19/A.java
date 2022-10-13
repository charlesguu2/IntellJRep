package class19;
        /*Write program to inherit class A that has method printF
        which is static and call or reuse that method into class B*/
public class A {


    static void printF() {
        System.out.println("I love skating");
    }
}
class B extends A{
    public static void main(String[] args) {
        B.printF();
    }
}
