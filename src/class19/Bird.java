package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    Bird(String name,String color,int age,double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    void printInfo(){
    System.out.println("Name "+name+" Color "+color+" Age "+age+" Weight "+weight);
}
}


class Test{
    public static void main(String[] args) {
       Parrot p=new Parrot("Zeki","Green",2,1);
       p.printInfo();

       Parrot crow=new Parrot("Crow","Black",3,1);
       crow.printInfo();

       Sparrow sparrow=new Sparrow("Sparrow","White",3,1.5);
       sparrow.printInfo();
    }
}