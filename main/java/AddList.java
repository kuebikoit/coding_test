import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddList {


    public static void main(String[] args) {
        AddList addList=new AddList();
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the integer and -1 to exit: ");
        while (true) {
            int x = sc.nextInt();
            if (x==-1) {
                break;
            }
            list.add(x);

        }
        addList.sum(list);
    }

    public Integer sum(List<Integer> numbers) {
        //  List<Integer>numbers= new ArrayList<Integer>();
        int sum = 0;
        for (Integer input : numbers) {
            sum += input;
        }
        System.out.println(sum);
        return sum;

    }

}
