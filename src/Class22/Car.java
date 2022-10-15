package Class22;

public class Car {

    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car {

    void start(){
        System.out.println("Use Push start to start me");
    }

    void stop(){
        System.out.println("I can also use auto braking to stop me");
    }
}

class Toyota extends Car{

      void start(){
          System.out.println("push me to start");
      }

}
