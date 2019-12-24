package exercise;

import java.util.Scanner;

public class factorial {
    public Integer factorial(Integer number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number*factorial(number-1);
    }

    public static void main(String[] args) {
        factorial n=new factorial();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(n.factorial(num));

    }
}
