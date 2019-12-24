import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println ("Please enter desired integer input:::");
       int input=in.nextInt();
       int result = 1;
       
       while(input>0){
            result *= input;
            input--;
       }
        System.out.println ("Desired output=   "+result);
    }
}
