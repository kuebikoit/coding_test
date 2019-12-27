package com.kuebiko.it;

import java.util.Scanner;

public class factorial {
    public static int fact(int number){
        int result = 1;

        while (number > 0) {
            result *= number;
            number--;
        }
        return  result;
    }
//    public static void main(String[] args) {
//       Scanner in = new Scanner (System.in);
//        System.out.println ("Please enter desired integer input:::");
//        int input = in.nextInt ();
//    int res= fact(input);
//        System.out.println (res);
//
//
//        }
    }

