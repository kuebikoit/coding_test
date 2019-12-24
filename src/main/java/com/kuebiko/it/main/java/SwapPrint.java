import java.util.Scanner;

public class SwapPrint {
    public static void main(String[] args) {
        SwapPrint sp = new SwapPrint();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  Number a : ");
        int a = sc.nextInt();
        System.out.println(" Enter  Number  b: ");
        int b = sc.nextInt();
        sp.SwapAndPrint(a, b);
    }

    public void SwapAndPrint(int a, int b) {
        //3 , 5
        //  System.out.println("Before  " + "a= " + a + ", b= " + b);
        System.out.println(a+" "+b);
        b = a + b; //8
        a = b - a;  //5
        b = b - a;
     //   System.out.println("After  " + "a= " + a + ", b= " + b);
        System.out.println(a+" "+b);

    }
}
