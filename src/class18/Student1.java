package class18;

public class Student1 {
    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    public Student1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfoMethod(){
        System.out.println(this.name);
        System.out.println(this.address);
    }

    public static void main(String[] args) {
        Student1 st1=new Student1("Charles","charlesguevara689@yahoo.com");
        st1.displayInfoMethod();

    }




}
