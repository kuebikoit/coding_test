package exercise;

import java.util.Scanner;

public class swap {
    public static void swapAndPrint(int a, int b){
        System.out.println("a=" + a + " " +"b="+b);
        if(a!=b){
            int temp;
            temp =a;
            a=b;
            b=temp;
            System.out.println("a=" + a + " " + "b="+b);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number:");
        int num1 = in.nextInt();
        System.out.print("enter second number:");
        int num2 = in.nextInt();
        swapAndPrint(num1, num2);
    }
}



