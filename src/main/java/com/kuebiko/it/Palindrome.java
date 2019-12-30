package com.kuebiko.it;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.Scanner;

public class Palindrome {
    public static String StringDemo(String input){
        String reverse = "";
        for (int i = input.length () - 1; i >= 0; i--) {
            reverse = reverse + input.charAt (i);
        }
        if (input.equals (reverse)) {
            System.out.println ("This is the palindrome");
        } else {
            System.out.println ("This is not palindrome.");
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter the desired input::: ");
        String input = scanner.nextLine ();
      String result= StringDemo(input);
        System.out.println ("Output==="+result);
    }
}
