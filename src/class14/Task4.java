package class14;

public class Task4 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */
        String str="This is the sentence I want to reverse";
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
             String word=arr[i];
             StringBuilder stringBuilder= new StringBuilder(word);
             stringBuilder.reverse();
             arr[i]=stringBuilder.toString();

        }
        System.out.println("arr = "+arr);

    }
}
