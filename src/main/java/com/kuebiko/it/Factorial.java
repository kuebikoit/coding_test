package CubicTest;

public class Factorial {
    public Integer factorial(Integer number){
        int fact;
        if(number <= 1 ){
            return 1;
        }else{
           return number * factorial(number-1);
        }
    }

    public static void main(String[] args) {
        Factorial fc = new Factorial();
        System.out.println(fc.factorial(5));
    }
}
