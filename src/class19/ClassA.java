package class19;

public class ClassA{
int age;

String color;

boolean happy;

ClassA(int age,String color,boolean happy){
    this.age=age;
    this.color=color;
    this.happy=happy;
}

}
class ClassB extends ClassA{
    public ClassB(int age,String color,boolean happy){
        super(age, color, happy);
    }
}
class ClassC extends ClassB {
    public ClassC(int age,String color,boolean happy){
        super(age, color, happy);
    }

}