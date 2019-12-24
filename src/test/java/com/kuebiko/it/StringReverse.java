import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();
        String temp =" ";
        for(int i=word.length()-1;i>=0;i--){

            temp+=word.charAt(i);
        }
        System.out.println(temp);
    }
}