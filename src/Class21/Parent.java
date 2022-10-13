package Class21;

public class Parent {


    void getMarry(){
        System.out.println("You will marry the girl we select for you");
    }
}

class Zam extends Parent{

    @Override
    void getMarry() {
        System.out.println("I want to marry taylor swift");
    }
}
class Test{
    public static void main(String[] args) {
        Zam zam=new Zam();
        zam.getMarry();
    }
}
