package class19;
/*Write a Java program called Teacher.  Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would
have it their own features and behaviour. Test all 4 classes*/

public class Teacher {
 int age;
 char sex;
 String name;
 String eyes;
 String hair;

 public Teacher(int age, char sex, String name, String eyes, String hair){
    this.age = age;
    this.sex = sex;
    this.name = name;
    this.eyes = eyes;
    this.hair = hair;
    }

}
class MathTeacher extends Teacher {
    public MathTeacher(int age, char sex, String name, String eyes, String hair) {
        super(age, sex, name, eyes, hair);
    }

    public void mtbehaviour() {
        System.out.println("The math teacher is " + age + " years old and his sex is " + sex + " his name is " + name + " the color of his eyes are " + eyes + " and the color of his hair is " + hair);
    }
}
class ChemistryTeacher extends Teacher{
    public ChemistryTeacher(int age, char sex, String name, String eyes, String hair) {
        super(age, sex, name, eyes, hair);
    }
    public void chembehaviour(){
        System.out.println("The chemistry teacher is "+age+" years old and her sex is "+sex+" her name is "+name+" the color of her eyes are "+eyes+" and the color of her hair is "+hair);
    }
}

class PianoTeacher extends Teacher{
    public PianoTeacher(int age, char sex, String name, String eyes, String hair) {
        super(age, sex, name, eyes, hair);
    }
    public void pibehaviour(){
        System.out.println("The piano teacher is "+age+" years old and there sex is "+sex+" his name is "+name+" the color of his eyes are "+eyes+" and the color of his hair is "+hair);
    }
}

class Testerr{
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher(21, 'M',"John","black","brown");
        mt.mtbehaviour();
        ChemistryTeacher ch = new ChemistryTeacher(29,'F',"Rachell","blue","black");
        ch.chembehaviour();
        PianoTeacher pi = new PianoTeacher(32,'M',"Joshan","green","blonde");
        pi.pibehaviour();

    }

    }
