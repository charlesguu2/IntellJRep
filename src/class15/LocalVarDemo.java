package class15;

public class LocalVarDemo {

    public static void main(String[] args) {
        int number =0;
        /*
        local variables are defined inside blocks of code and can
        only be used inside these blocks of code
        */
       // System.out.println(name);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        {
            int i=0;
        }
        //System.out.println(i);
    }

    void printNumber(){
        //System.out.println(number);
        String name="Allan";
    }

}
