package com.kuebiko.it;

public class Task3{

    public String printFizzBuzz(Integer number) throws CustomException {
        if(number==0){
            return String.valueOf(0);
        }
        if(number%3==0 && number%5==0){
            return "FizzBizz";
        } else if (number%5==0) {
            return "Buzz";
        } else if(number%3==0){
            return "Fizz";
        }
        else
            return number.toString();
    }

    public static void main(String[] args) {
        Task3 task3= new Task3();
        try {
            System.out.println("3. " + task3.printFizzBuzz(0));
            System.out.println("5. " + task3.printFizzBuzz(5));
            System.out.println("15. " + task3.printFizzBuzz(15));
            System.out.println("7. " + task3.printFizzBuzz(7));
        }catch (CustomException e){
            e.printStackTrace();
        }
    }
}
