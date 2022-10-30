package class24;

public class Horse {
    private String color;
    private int age;
    private String size;
    private double weight;
    private char sex;

    public Horse(String color, int age, String size, double weight, char sex) {
        setColor(color);
        setAge(age);
        setSize(size);
        setWeight(weight);
        setSex(sex);
    }
    void printInfo() {
        System.out.println("Color: "+color+" Age: "+age+" Size: "+size+" Weight: "+weight+" Sex: "+sex);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if(color!="Green") {
            System.out.println("Please chose another color");
        } else {
            this.color = color;
        }

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>15) {
            System.out.println("This horse is too old. Try again");
        }
        else {
            this.age = age;
        }
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if(size.isEmpty()) {
            System.out.println("Please insert a size, don't be shy.");
        } else {
            this.size = size;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
       if(weight>110) {
           System.out.println("This horse weights a lot");
       } else {
           this.weight = weight;
       }
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        if(sex=='F') {
            System.out.println("Please enter M for Male. Thank you.");
        }
        this.sex = sex;
    }
}
class Tester {

    public static void main(String[] args) {
        Horse h1 = new Horse("Red",31,"",120,'F');
        h1.printInfo();



    }
}
