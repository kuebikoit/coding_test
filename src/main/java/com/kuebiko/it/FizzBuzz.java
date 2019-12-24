package CubicTest;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz r = new FizzBuzz();
        r.fizzBuzz(30);
        System.out.println( r.fizzBuzz(30));
    }
    public String fizzBuzz(int number){

         if(number % 3 ==0 & number % 5 !=0 ){
        return "Fizz";
         }
        if(number % 3 !=0 & number % 5 ==0){
            return "Buzz";
        }
        if(number % 3 ==0 & number % 5 ==0){
           return "FizzBuzz";
        }
        if((number % 3 !=0 & number % 5 !=0 )|| number ==0){
            return Integer.toString(number);
        }
          return String.valueOf(number);
    }
}
