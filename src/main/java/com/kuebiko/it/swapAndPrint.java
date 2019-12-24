package CubicTest;

public class swapAndPrint {
    public void swapAndPrint(int a, int b){
        System.out.println("a = "+ a + ","+ "b = "+ b);
        int temp = b;
        b =a;
        a = temp;
        System.out.println("a = "+ a + ","+ "b = "+ b);

    }

    public static void main(String[] args) {
        swapAndPrint sp = new swapAndPrint();
        sp.swapAndPrint(3,4);
    }
}
