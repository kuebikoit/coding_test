package Day21;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any string.");
        String word = sc.nextLine();
        char[] ch = word.toCharArray();

        for (int i = ch.length-1 ; i >= 0; i--) {
            System.out.print(ch[i]);

        }
    }
}
