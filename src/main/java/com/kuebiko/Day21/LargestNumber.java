package Day21;

public class LargestNumber {
    public static void main(String[] args) {
        int[]number={4,5,8,9,77,54,65,88};
     LargestNumber largestNumber=new LargestNumber();
     largestNumber.largestNum(number);
    }

    public int largestNum(int[] number) {
        int max=0;
        for (int i = 0; i < number.length ; i++) {
            if (max< number[i]) {
                max = number[i];
            }

        }
        System.out.println(max);
        return max;
    }
}
