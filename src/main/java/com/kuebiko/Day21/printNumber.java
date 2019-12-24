package Day21;

import java.util.Scanner;

public class printNumber {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        printNumber obj=new printNumber();
        System.out.println("Please enter any numbdr greater than zero:");
        int num= sc.nextInt();

        System.out.println(obj. findNum(num));
    }
    public static String findNum(Integer num){
        if(num ==0) {
            return num.toString();
            //System.out.println(num.toString());
        }
        else if((num%3)==0 && (num%5)==0){
            return "FizzBuzz";
            //System.out.println("FizzBuzz");

        }else if(num%3==0) {
            return "Fizz";
            //System.out.println("Fizz");
        }else if(num%5==0){
            return "Buzz";
            //System.out.println("Buzz");
        }else{
            return num.toString();
            //System.out.println(num);
        }

    }
}
