package exercise;

class ReverseWord {
    public String reverse(String input){
        char[] in= input.toCharArray();
        int start = 0;
        int end = in.length-1;
        char temp;
            while(end>start) {
                temp = in[start];
                in[start] = in[end];
                in[end] = temp;
                end--;
                start++;
            }
            return new String(in);
        }

    public static void main(String[] args) {
        ReverseWord s =new ReverseWord();
        String n="Reverse This!";
        System.out.println(s.reverse(n));

    }
    }

