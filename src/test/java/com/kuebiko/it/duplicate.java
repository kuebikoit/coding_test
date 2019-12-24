import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many word you want to save?");
        int number = input.nextInt();

        String[] My_X = new String[number];
        System.out.println("Enter the characters you want to compare: ");

        for (int i = 0; i < number; i++) {
            My_X[i] = input.nextLine();
        }

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < My_X.length; i++) {
            if (set.add(My_X[i]) == false) {
                System.out.println("Duplicate element found : " + My_X[i]);
            } else {
                System.out.println("No duplication!");
            }
        }
    }
}