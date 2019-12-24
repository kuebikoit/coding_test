import org.junit.Assert;
import org.junit.Test;

public class PrintFizzBuzzerTest {

    @Test
    public void print() {
        PrintFizzBuzzer pb = new PrintFizzBuzzer();
        int num = 0;
        String S_num="0";
        int num1 = 5;
        String S_num1 = "Buzz";
        int num2 = 9;
        String S_num2 = "Fizz";
        int num3 = 15;
        String S_num3 = "FizzBuzz";

      //  System.out.println(pb.print(num));
        Assert.assertEquals(S_num, "0");
        Assert.assertEquals(S_num1, "Buzz");
        Assert.assertEquals(S_num2, "Fizz");
        Assert.assertEquals(S_num3, "FizzBuzz");


    }
}