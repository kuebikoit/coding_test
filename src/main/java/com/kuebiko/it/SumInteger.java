package exercise;

import java.util.ArrayList;
import java.util.List;


public class SumInteger {

    public static Integer sum(List<Integer>numbers){
        int add =0;
        for(int i:numbers){
            add +=i;
        }
        return add;
    }

    public static void main(String[] args) {
        SumInteger s = new SumInteger();
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(4);
        System.out.println(s.sum(num));
    }
}
