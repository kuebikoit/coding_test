import java.util.ArrayList;
import java.util.Scanner;

public class q5 {
    public static int[] swap(int num1,int num2){
    int[] num3 =new int[2];
    num3[0]=num1;
    num3[1]=num2;
       /*for (int i=num3.length-1;i>0;i--){
            System.out.println(num3[i]);
       }*/

    return num3;
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 2 numbers");
        int num1 = number.nextInt();
        int num2= number.nextInt();
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        int [] num3=swap(num1,num2);
        for (int i=1;i>=0;i--){
            System.out.println("num1="+num3[i]);
        }



        }

    }

