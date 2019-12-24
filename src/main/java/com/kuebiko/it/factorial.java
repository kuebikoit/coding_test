package CubicTest;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
factorial r = new factorial();
r.factorialNum(8);
    }


    public  Integer factorialNum(Integer number){

        int factorialResult=1;
for (int i=number;i>0;i--){
    factorialResult=  factorialResult * i;
                    }
                return factorialResult;
    }
}
