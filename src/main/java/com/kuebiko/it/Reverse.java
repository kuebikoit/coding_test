import java.util.List;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
//        System.out.println ("Enter the desired first integer: ");
//int a=new Scanner(System.in).nextInt ();
//        System.out.println ("Enter the desired second integer: ");
//int b=new Scanner(System.in).nextInt();
//        System.out.println ("the sum is "+ Integer.sum(a,b));


        //reverse the string using .reverse and using loop
        Scanner in=new Scanner(System.in);
        System.out.println ("please enter the desired string");
        java.lang.String input=in.nextLine ();
//        StringBuffer str= new StringBuffer (input);
//        System.out.println ("Desired result is ::"+str.reverse ());
        String result="";
        for(int i=input.length()-1; i>=0;i--){
            result=result+input.charAt(i);
        }
        System.out.println ("Result::"+result);
    }
}
