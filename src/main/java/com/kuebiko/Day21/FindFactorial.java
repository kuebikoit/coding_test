package Day21;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int factorial=1;
        System.out.println("Please enter any number ");
        int num= input.nextInt();
        FindFactorial findFactorial=new FindFactorial();
        int result=findFactorial.findFactorial(num);
        System.out.println("Factorial of "+ num+ " is "+ result);

    }
    public int findFactorial(int num){
        int factorial = 1;
        if(num<0){
            System.out.println("Please enter positive number");
        }else{
            for(int i=1;i<=num;i++){

                factorial=factorial*i;
            }
        }
      return factorial;
    }

}
