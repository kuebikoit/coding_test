package suvam;

/**
 * Reverse string
 *
 */

public class StringReverse {

    String cba;

    public StringReverse(String cba) {
        this.cba = "cba";
    }

    public StringBuilder rev(String input) {


        int length = 0;

        char A;
        StringBuilder reverse = new StringBuilder();

        for (int i = 1; i <= input.length(); i++) {

            A = input.charAt(input.length() - i);
            String temp = String.valueOf(A);
            reverse.append(temp);
        }

        return reverse;
    }
}
