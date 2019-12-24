package Day21;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        String[] names = {"one", "two", "four", "four","one"};
        FindDuplicate obj=new FindDuplicate();
        obj.findDuplicate(names);

    }
    public ArrayList<String> findDuplicate(String[] names){
        ArrayList<String> result= new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    result.add(names[i]);
                    System.out.println(result);

                }
            }
        }

        return result;
    }
}
