import java.util.Scanner;

public class FizzBuzz {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        FizzBuzz fizzBuzz= new FizzBuzz();
        fizzBuzz.printFizzBuzz(num);
    }
    public void printFizzBuzz(Integer number){
        if(number ==0){
            System.out.println(number.toString());
        }
        if(number%3!=0 && (number%5!=0)){
            System.out.println(number.toString());
        }

        if(number%3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }
        else if (number %3==0){
            System.out.println("Fizz");
        }
        else if(number %5==0){
            System.out.println("Buzz");
        }
    }
}
