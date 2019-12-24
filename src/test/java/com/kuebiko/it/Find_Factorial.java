import java.util.Scanner;

public class Find_Factorial {
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int x = word.nextInt();
        Find_Factorial pass = new Find_Factorial();
        System.out.println(pass.factorial(x));

    }

    public Integer factorial(Integer number){
        if(number==0|| number==1){
           return 1;
        }
        while(number > 1){
            return number*factorial(number-1);
        }

    return number;
    }
}
