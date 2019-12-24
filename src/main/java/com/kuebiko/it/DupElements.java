package CubicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class DupElements {
    public static void main(String[] args) {
        String[] input ={"one","two","four","four","one"};
        ArrayList<String>input1= new ArrayList<String>(Arrays.asList(input));
        DupElements r = new DupElements();
         r.DuplicateElements(input1);
    }

    public ArrayList<String>DuplicateElements(ArrayList<String>list){
        ArrayList<String> temp = new ArrayList<String>();
        System.out.println("New array is : " );
        for(int i=0;i<list.size();i++){
           for(int j=i+1;j<list.size();j++){
               if (list.get(i).equals(list.get(j))) {
                   if (!temp.contains(list.get(i))) {
            temp.add(list.get(i));
                   }
                  break;
               }}


        }
        System.out.println(temp);
return temp;
    }
}
