package ReviewClasses;

public class School {
    public static void main(String[] args) {
        Teacher t = new Teacher("John", "Smith");
        System.out.println(t.name);

        new Teacher("Jane","Smith","Biology").teach();

        new Teacher("Jal","Smoke",8).print();

        Teacher.school="Syntax";



    }
}
