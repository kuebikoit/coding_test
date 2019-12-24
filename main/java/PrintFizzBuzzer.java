import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrintFizzBuzzer {
    public static void main(String[] args) {
        PrintFizzBuzzer pf= new PrintFizzBuzzer();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number : ");
        int input = sc.nextInt();
        System.out.println( pf.print(input));
    }
    public  String print(Integer input) {
        if(input==0){
            return " " +input.toString();
        }
        if (input % 3 == 0 & input % 5 == 0) {
           // return  "FizzBuzz";
         System.out.println("FizzBuzz");
        } else if (input % 3 == 0) {
            return "Fizz";
           // System.out.println("Fizz \n");
        } else if (input % 5 == 0) {
            return "Buzz";
          //  System.out.println("Buzz \n");
        } else {
            return " " + input;
          //  System.out.println(input);
        }
        return " ";
    }
}
