package com.kuebiko.it;

public class Task6 extends Exception{
    public Integer factorial(Integer number) throws CustomException  {
        if(number<0){
            CustomException exception = new CustomException("You cannot have Factorial for negative integer");
            throw exception;
        }
        if(number==0)
            return 1;
        else
            return number* factorial(number-1);
    }

    public static void main(String[] args) {
        Task6 task6= new Task6();
        try {
            System.out.println("4->" + task6.factorial(4));
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

}
