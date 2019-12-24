import java.util.ArrayList;
import java.util.List;

public class duplicateElements {
    public static void main(String[] args) {
        duplicateElements dup = new duplicateElements();
        List<String> newList = new ArrayList<String>();
        System.out.println(dup.list(newList));
    }

    public List<String> list(List<String> newList) {

        List<String> list1 = new ArrayList<String>();

        for (int i = 0; i < newList.size(); i++) {
            for (int j = i+1; j < newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))) {
                    list1.add(newList.get(i));
                }
            }
        }
        return list1;
    }
}


