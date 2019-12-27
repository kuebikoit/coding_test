package com.kuebiko.it;

import java.util.List;
import java.util.Scanner;

public class Reverse {

    public static String reverseString(String input) {
        String result = "";
        for (int i = input.length () - 1; i >= 0; i--) {
            result = result + input.charAt (i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("please enter the desired string");
        java.lang.String input = in.nextLine ();
        String result = reverseString (input);
        System.out.println ("Result::" + result);
    }


}
