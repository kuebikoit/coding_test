import java.util.Scanner;

public class q2 {
  public static String reverse(String name){
     String reverse = "";
     for (int i=name.length()-1;i>=0; i--) {
         reverse = reverse + name.charAt(i);

     }
         return reverse;
    }



    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String name = myObj.nextLine();  // Read user input;
        String reverse = reverse(name);
        System.out.println("reverse is "+reverse);
    }
}

