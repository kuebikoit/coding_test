public class Factorial {
    public static void main(String[] args) {
        Factorial factorial= new Factorial();
        System.out.println(factorial.factorial(5));
    }
    public Integer factorial(Integer number){
        if (number==1||(number==0)){
            return 1;
        }
        while (number!=1){
            return number*factorial(number-1);

        }
   return number;
    }
}
