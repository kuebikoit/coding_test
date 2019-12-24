import java.util.Scanner;

public class q3 {
    public static String number(int num) {
        String number = "";
        if (num % 3 == 0 && num %5==0) {
            number = "FizzBuzz";
        } else if (num % 5 == 0) {
            number = "Buzz";
        } else if (num % 3 == 0 ) {
            number = "Fizz";

        } else
        {
            number = Integer.toString(num);
        }

        return number;
    }


    public static void main(String[] args) {
        Scanner myObjnum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        int num = myObjnum.nextInt();  // Read user input;
        String number = number(num);
        System.out.println(num + "--> "+number);
    }
}
