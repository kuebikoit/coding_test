package src.CUBICTEST;

import java.util.HashSet;
import java.util.List;

public class TestMain {




    public static void main(String[] args) {



    }






// sum a list of integer
    public  Integer sum(List<Integer> numbers){
        int length= numbers.size();
        int sum=0;
        if(numbers.isEmpty()){
            System.out.println("The list is empty.");
            return  0;
        }

        for (int i=0;i<length;i++){
            sum+= numbers.get(i);
        }
        return  sum;

    }
// reverse a string
    public String reverse(String input) throws NullPointerException{
         if (input==null){
            System.out.println("the string is null");


            return null;

        }

        else if(input.isEmpty()){
            System.out.println("the String is empty");
            return  null;
        }
        // we can also return the stringBuilder as it has in built reverse function.
        //        StringBuilder reversedString= new StringBuilder(input);
        //        reversedString.reverse();

        String reversedString="";


        for (int i=input.length()-1;i>=0;i--) {


            reversedString += input.charAt(i);
        }
       return reversedString;
    }

    //print fizzBuzz

    public String printFizzBuzz(Integer number){
        if(number==0){
            return number.toString();
        }
         else if((number%3==0)&&(number%5==0)){
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }else if(number%3==0){
            System.out.println("Fizz");
            return "Fizz";
        }else if(number%5==0){
            System.out.println("Buzz");
            return "Buzz";

        }else{
            System.out.println(number);
            return number.toString();

        }

    }




    //duplicate elements in an array
    public HashSet<String> findDuplicates(String[]arr){

        if (arr.length==0) {
            System.out.println("This array is empty.");
            return null;
        }

       HashSet<String> hashSet= new HashSet<>();
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                  //  System.out.println(i+"is a duplicate of"+j);
                    hashSet.add(arr[i]);
                }
            }
        }

        return hashSet;
    }

    //swap and print method arguments

    public boolean swapAndPrint(int a, int b){
        System.out.println("a="+a+",b="+b);
        if(a==0&&b==0){
            System.out.println("a="+a+",b="+b);
            return false;

        }else{
            int temp=a;
            int temp1=b;

            a=temp1;
            b=temp;
            System.out.println("a="+a+",b="+b);

            return true;
        }


    }

    //find factorial
    public Integer factorial(Integer number){
        Integer factorial=1;


        if(number==0 && number==1){
            return 1;
        }else if(number<0){
            System.out.println("This cannot have the factorial.");
            return -1;
        }

     for (int i=1;i<=number;i++){
         factorial= factorial*i;
     }
     return factorial;
    }

    //find the largest number in an array

    public int max(int [] arr){
        int num=0;
        if(arr.length==0){
            System.out.println("There is no elements inside the array.");
            return -1;
        }

        for(int i=0;i<arr.length;i++){
         if(num<arr[i]){
             num=arr[i];
         }
        }
        return  num;

    }


}

