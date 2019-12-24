package CubicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
    public String[] findDuplicate(String[] arr){
        ArrayList<String> duplicate = new ArrayList<String>();
        for (int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]==(arr[j])){
                   if(!duplicate.contains(arr[i])){
                       duplicate.add(arr[i]);
                   }
                   break;
                }

            }
        }

        return duplicate.toArray(new String[duplicate.size()]);
    }

    public static void main(String[] args) {
        String[] dupli = {"one", "two","four", "four", "one"};
        FindDuplicates fd = new FindDuplicates();

        String[] array = fd.findDuplicate(dupli);
        System.out.println(Arrays.toString(array));

    }
}
