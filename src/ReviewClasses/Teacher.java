package ReviewClasses;

public class Teacher {
    String name, lname;
    String subject;
    int experience;
    double salary;

    static String school;

    // this. - used to refer to the current object: instance variables
                                                  // instance methods
    Teacher(String name, String lname){
        this.name=name;
        this.lname=lname;
    }
    //this() - refers to the current object: current class constructor

    Teacher(String name, String lname,String subject){

    }


}
