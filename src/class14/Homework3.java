package class14;

public class Homework3 {

    // Create a method that will print whether given String is palindrome or not

       boolean palindrome(String word) {
           String reverse = " ";
           for (int i = word.length()-1; i > 0 ; i++) {
               reverse+=word.charAt(i);
           }
           if(reverse.equals(word)) {
          return true;
          } else {
            return false;
           }
           }

    public static void main(String[] args) {
        Homework3 hw=new Homework3();
        if(hw.palindrome("I did, did I")) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }


    }


}



