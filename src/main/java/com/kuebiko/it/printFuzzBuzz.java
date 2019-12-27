package com.kuebiko.it;

import java.util.Scanner;

public class printFuzzBuzz {
    public static String fuzz(int input){
        String out="";
        if(input%3==0 && input%5==0){
         out="FIZZBUZZ";
        }
        else if(input%3==0){
            out="FIZZ";

        }
        else if(input%5==0){
           out="BUZZ";
        }
        else{
           out=String.valueOf (input);
        }
        return out;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("enter the desire integer");
        int input = in.nextInt ();
        String result=fuzz(input);
        System.out.println ("the output== "+result);


    }
}