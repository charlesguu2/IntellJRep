package class17;

public class Dog {
   private String name;
   private String breed;
   private String color;
   private int age;
   private double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight) {
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }

    void printInfo() {
        System.out.println("name "+name+" "+" breed");
    }

    public static void main(String[] args) {
       /* Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;*/
        Dog dog=new Dog("Tomy","Huskey","Pink",10,30 );

        dog.printInfo();

       /* Dog dog1=new Dog();
        dog1.name="Tomy";
        dog1.breed="Huskey";
        dog1.color="Pink";
        dog1.age=10;
        dog1.weight=30;*/
        Dog dog2=new Dog("Jay","Pit","Blue",21,124.2);
        dog2.printInfo();

    }

}
