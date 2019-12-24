import java.util.Scanner;

public class SwapandPrint {
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = word.nextInt();
        System.out.println("Enter the second number: ");
        int y = word.nextInt();
        SwapandPrint pass = new SwapandPrint();
        System.out.println("a= "+x+"b= "+y);
        pass.swap(x, y);

    }
    public void swap(int a, int b){
                int temp1=a;
                int temp2=b;
                a = temp2;
                b= temp1;
        System.out.println("a= "+a+"b= "+b);
    }
}
