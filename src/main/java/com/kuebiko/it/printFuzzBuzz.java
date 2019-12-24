import java.util.Scanner;

public class printFuzzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("enter the desire integer");
        int input = in.nextInt ();
        if(input%3==0 && input%5==0){
            System.out.println ("FIZZBUZZ");
        }
        else if(input%3==0){
            System.out.println ("FIZZ");

        }
        else if(input%5==0){
            System.out.println ("BUZZ");
        }
        else{
            System.out.println (input);
        }
    }
}