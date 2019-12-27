package com.kuebiko.it;

public class swapAndprint {
     public static String swapPrint(int a,int b){

        int temp=a;
        a=b;
        b = temp;
      return (String.valueOf(a)+ ","+ String.valueOf (b));
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println("Resultsssss==="+swapPrint(a,b));
    }
}
