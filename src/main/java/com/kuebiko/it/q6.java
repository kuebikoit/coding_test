import java.util.Scanner;

public class q6 {
    public static int factorial(int num){
        int factorial=1;
        for (int i = 1; i <num ; i++) {
            factorial=num*i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");
        int num = number.nextInt();
        int factorial=factorial(num);
        System.out.println("factorial is "+factorial);
    }
}
