package CubicTest;

public class FizzBuzz {
    public String printFizzBuzz(Integer number){
        if (number.equals(0)) {
            return number.toString();
        }
        if(number%5==0 && number %3==0 ){
            return  "FizzBuzz";
        }else if(number%5==0 ){
            return  "Buzz";
        }else if(number%3==0 ){
            return  "Fizz";
        }else{
           return number.toString();
        }

    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.printFizzBuzz(7));
    }
}
