import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial fc= new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  Number  : ");
        int a = sc.nextInt();
        System.out.println(fc.factorial(a));
    }

    public Integer factorial(Integer num) {
         int n=1;
           for (int i = 1; i <= num; i++) {
              n*=i;
            }

        return n;

        }
    }


