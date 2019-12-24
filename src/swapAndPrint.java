import java.util.Scanner;

public class swapAndPrint {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int a= scanner.nextInt();
       int b= scanner.nextInt();
        swapAndPrint swap = new swapAndPrint();
        swap.swapAndPrint(a,b);
    }
    public void swapAndPrint(int a, int b){
        System.out.println("a= " +a + ", b= "+b);
        a= a+b;
        b=a-b;
        a= a-b;
        System.out.println("a= " +a + ", b= "+b);

    }
}
