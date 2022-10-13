package class18;

public class Task3Tester {
    public static void main(String[] args) {
        // new Task3(); fails because it is private
        new Task3("Thank you");
        new Task3(10);
        new Task3(true);
    }
}
