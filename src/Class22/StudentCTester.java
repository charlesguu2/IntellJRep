package Class22;

public class StudentCTester {
    public static void main(String[] args) {
        Student [] students = {new SyntaxStudent(),new SchoolStudent(),new CollegeStudent()};
        for(Student stu : students) {
            stu.sports();
            stu.transport();
            stu.exercise();
        }

    }
}
