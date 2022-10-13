package class16;

public class Task1Tester {


    public static void main(String[] args) {
        SyntaxEmployess syntaxEmployess =new SyntaxEmployess();
        syntaxEmployess.empId="123";
        syntaxEmployess.salary=100000;


        SyntaxEmployess moazzamEmp =new SyntaxEmployess();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

    }
}
class Main {

    String name=null;
    int roll_no=0;

    void sentence(String word, int roll) {
        System.out.println("Name is "+word+" and roll number is "+roll);
        return;
    }





    public static void main(String[] args) {
        Main m = new Main();
        m.sentence("John",2);


    }






}
