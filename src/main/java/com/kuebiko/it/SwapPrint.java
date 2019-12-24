package CubicTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapPrint {

    public static void main(String[] args) {
SwapPrint r = new SwapPrint();
r.swapAndPrint(8,9);
    }
    public ArrayList<Integer> swapAndPrint(int a , int b){
        ArrayList<Integer> ValuesInArrayList = new ArrayList<Integer>(Arrays.asList(a,b));
        System.out.println(ValuesInArrayList);
         int temp =a;
         a =b;
         b= temp;

        ArrayList<Integer> NewValuesInArrayList = new ArrayList<Integer>(Arrays.asList(a,b));
        System.out.println(NewValuesInArrayList);
        return NewValuesInArrayList;
    }
}
