package CubicTest;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ReverseStringUsingForLoop {
    public String reverse(String input){
        String reverse= "";

        for(int i =input.length()-1; i>=0;i--){
            reverse+=input.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        ReverseStringUsingForLoop rs = new ReverseStringUsingForLoop();
        System.out.println(rs.reverse("sandesh"));

    }
}
