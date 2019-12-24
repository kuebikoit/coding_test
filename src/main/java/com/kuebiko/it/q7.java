public class q7 {
    public static int largest(int[] num){
        int largest=0;
        for (int i = 0; i <num.length ; i++) {
            if (num[i]>largest){
                largest=num[i];
            }

        }
            return largest;
    }

    public static void main(String[] args) {
    int num[]={1,2,3,4,5};
    int largest=largest(num);
        System.out.println("largest is "+largest);
    }
}
