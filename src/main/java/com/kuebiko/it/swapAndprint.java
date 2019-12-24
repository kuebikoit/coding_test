
public class swapAndprint {
     public static void swapAndPrint(int a,int b){
        int temp=a;
        a=b;
        b = temp;
        System.out.println ("a="+ a + "b="+b);
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        swapAndPrint(a,b);



    }
}
