package Class22;

public class Student {
    /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
     Define common behavior within parent class and override some of the methods in child classes.
     Define some methods specific to child classes
     Write example of achieving run time polymorphism
     */
    public void transport(){
        System.out.println("Student walks to school");
    }
    public void sports(){
        System.out.println("Student plays soccer");
    }
    public void exercise(){
        System.out.println("Student exercises at home ");
    }

}
class SyntaxStudent extends Student {
    public void transport(){
        System.out.println("Student bikes to school");
    }
}
class CollegeStudent extends Student {
    public void exercise(){
        System.out.println("Student exercises at his universities public gym");
    }
}
class SchoolStudent extends Student {
    public void sports(){
        System.out.println("Student plays football");
    }
}