package Day21;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();
        System.out.println("Please enter second number");
        int num2=input.nextInt();
        System.out.println("Before swapping "+num1+" "+ num2);
        int temp=0;
        temp =num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping "+num1+" "+ num2);
    }
}
