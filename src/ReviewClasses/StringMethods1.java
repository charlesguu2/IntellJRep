package ReviewClasses;

import java.sql.SQLOutput;

public class StringMethods1 {
    public static void main(String[] args) {

        String textFromApplication="  Enroll today  ";
        String textFromUserStory="Enroll today";

        if(textFromApplication.trim().equals(textFromUserStory)) {
            System.out.println("Text is matched.Test Pass");
        }
        else {
            System.out.println("Text is NOT matched.Test Failed ");
        }

        System.out.println(textFromApplication.trim()); // "Enroll Today"
        System.out.println(textFromApplication); // "  Enroll Today  "

        //substring

        String str = "Hello Class";
        String part2=str.substring(6); // Class
        System.out.println(part2);

        //Hello

        String part3=str.substring(0,5);
        System.out.println(part3);

        //concat
        String newString=part3.concat(" ").concat(part2);
        System.out.println(newString);

        System.out.println(part3+part2);

        // some examples

        char single=newString.substring(6).charAt(0);
        System.out.println(single);

        // newString.charAt(0).substring(6); CE

        // replace();

        String myString="Today is September";
        myString=myString.replace("September","October"); // Does replace if found

        System.out.println(myString);

        myString=myString.replace('A','w'); // Does not replace if not found
        System.out.println(myString);

        // split();

        String myStr = "Today is a review class";

        String [] array=myStr.split(" ");
        System.out.println(array.length);
        System.out.println(array[3]); // review

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // other way
         for(String arr:array) {
            System.out.println(arr);
        }











    }

}
