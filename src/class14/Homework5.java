package class14;

import java.util.Scanner;

public class Homework5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String username, String lastName, String emailtype) {
        return (username+lastName+"@"+emailtype+".com");

    }

    public static void main(String[] args) {
        Homework5 hw=new Homework5();
        String fullEmail= hw.createEmail("John", "Snow","gmail" );
        System.out.println(fullEmail);
        System.out.println(hw.createEmail("CChar", "P","live"));




    }

}
