import java.util.Scanner;

public class stringReverse {
    
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Enter a string");
        String message = scanner.nextLine();
        stringReverse str = new stringReverse();
        System.out.println(str.reverse(message));

    }

    public String reverse (String input){
        String a= " ";
        String [] array = input.split(" ");
        for (int i=array.length-1;i>=0;i--){
            a += array[i]+" ";
        }
        return  a;
    }
}
