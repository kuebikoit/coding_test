import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       ReverseString rs= new ReverseString();
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the String : ");
           String input = sc.nextLine();

        System.out.println(rs.Reverse(input));
    }
    public String Reverse(String input)
    {
        String reverse=" ";
        for(int  i=input.length()-1;i>=0;i--)
        {
      reverse+= input.charAt(i);

        }
        return reverse;

    }
//     StringBuilder reverse = new StringBuilder(input);
//        return  reverse.reverse();

}

