package CubicTest;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
ReverseString r = new ReverseString();
r.reverse("inputValue" );
    }

    public String reverse(String inputValue) {
      //  System.out.println("Enter string to reverse:");
        //Scanner input = new Scanner(System.in);
        //String str = inputValue.nextLine();
        String reverse = "";

        for (int i = inputValue.length() - 1; i >= 0; i--) {
            reverse = reverse + inputValue.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
return reverse;
    }
}