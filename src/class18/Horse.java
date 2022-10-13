package class18;

public class Horse extends Animal {
    boolean canCook;


    Horse(String name,String breed,int age,double weight,boolean canCook){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
        this.canCook=canCook;
    }

    public static void main(String[] args) {
        Horse horseobject=new Horse("Jack","Sparrow",11,123.1,true);
        horseobject.printInfo();
    }
}
