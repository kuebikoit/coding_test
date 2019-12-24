import java.util.Scanner;

public class printFizzBuzz {
    public static void main(String[] args){
        printFizzBuzz obj = new printFizzBuzz();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        obj.printFizzBuzz(num);
    }
    public void printFizzBuzz(Integer number){


        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz.");
        }
        if(number%3==0){
            System.out.println("Fizz.");
        }
        if(number%5==0){
            System.out.println("Buzz.");
        }
        else{
            System.out.println(number);
        }

    }
}
