package com.kuebiko.it;

public class Task5 {

    public String swapAndPrint(int a, int b) {
        int temp=0;
        temp = a;
        a=b;
        b=temp;

        return "a="+a+",b="+b;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println("a=5,b=3 \n"+ task5.swapAndPrint(5,3));
    }
}
