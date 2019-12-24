import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to save?");
        int number = input.nextInt();


        int[] a = new int[number];
        int max;
        System.out.println("Enter elements of array:");

        for(int i = 0; i < number; i++)
        {
            a[i] = input.nextInt();
        }
        max = a[0];

        for(int i = 0; i < number; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        //num1.max(a);
        System.out.println("The largest element on the array is: "+max);

    }

   /*public int max(int[] arr){
        return max;
    }*/
}
