import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateElement {


    public static void main(String[] args) {
        DuplicateElement de = new DuplicateElement();
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String List ");
        while (true) {
            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            list.add(input);
        }
        System.out.println(de.list(list));
    }

    public List<String> list(List<String> input) {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i).equals(input.get(j))) {
                    list.add(input.get(i));
                }
            }

        }
        return list;
    }
}

