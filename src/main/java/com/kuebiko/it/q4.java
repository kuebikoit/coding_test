import com.sun.source.tree.UsesTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q4 {
   public static List<String> string(List<String> name){
       List<String> string= new ArrayList<String>();
        for(int i=0;i<name.size();i++) {
            for (int j = i+1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))){
                    string.add(name.get(i));
                }
            }
        }
        return string;
    }


    public static void main(String[] args) {
        List<String> name = Arrays.asList("one","two","four","four","one");
                List<String>string = string(name);
        System.out.println("reverse is "+string);

    }
}
