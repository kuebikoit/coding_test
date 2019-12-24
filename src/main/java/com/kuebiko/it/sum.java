import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        //        System.out.println ("Enter the desired first integer: ");
//int a=new Scanner(System.in).nextInt ();
//        System.out.println ("Enter the desired second integer: ");
//int b=new Scanner(System.in).nextInt();
//        System.out.println ("the sum is "+ Integer.sum(a,b));


//        Scanner in= new Scanner (System.in);
//        System.out.println ("Enter the desired input :");
//        int input1=in.nextInt ();
//        System.out.println ("enter the desired input2");
//        int input2=in.nextInt ();
//
//
//      sum(input1, input2);
//        System.out.println ("Output::::"+sum(input1,input2));

        List<Integer> numbers =new ArrayList<> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        System.out.println ("list" +numbers);
        int result=0;
        for(int i=0;i<numbers.size ();i++){
            result += numbers.get(i);
        }
        System.out.println ("final result::"+result);

    }
}
