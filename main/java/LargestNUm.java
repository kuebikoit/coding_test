import java.util.ArrayList;
import java.util.Scanner;

public class LargestNUm {
    public static void main(String[] args) {
        LargestNUm lar = new LargestNUm();
        ArrayList<Integer> input = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the num of : ");
        int x = sc.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(lar.max(array));
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
