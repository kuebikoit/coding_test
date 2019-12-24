package com.cubic.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {


        public Integer sum(List<Integer> numbers){
            Integer sum=0;
            for(int i=0; i< numbers.size(); i++){
                sum+= numbers.get(i);
            }
            return sum;
        }


        public String reverse(String input){
            StringBuilder sb= new StringBuilder("");
            for(int i=input.length()-1; i>=0; i--){
                sb.append(input.charAt(i));
            }
            return sb.toString();
        }

        public String printFizzBuzz(Integer number){
            if(number==0){
                return number.toString();
            }
            if(number%3==0&&number%5!=0){
                return "Fizz";
            }else if(number%5==0&&number%3!=0){
                return  "Buzz";
            }else if(number%5==0&&number%3==0){
                return "FizzBuzz";
            }else{
                return number.toString();
            }
        }


        public int max(int[] array){
            int max =array[0];
            for(int i=0; i< array.length; i++){
                if(max<array[i]){
                    max= array[i];
                }
            }
            return max;
        }


        public Integer factorial(Integer number){
            Integer result=1;
            for(int i=number; i>0; i--){
                result=result*i;
            }
            return  result;
        }

        public int[] swap(int a, int b){
          int temp=a;
          a=b;
          b=temp;
          return new int[]{a,b};
        };

        public  String[] findDuplicate(String[] array){

            List<String> temp= new ArrayList<>();

            for(int i=0; i< array.length; i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i]==array[j]){
                        if(!temp.contains(array[i])){
                            temp.add(array[i]);
                        }
                    }
                }
            }
            String[] arr = new String[temp.size()];
            arr=temp.toArray(arr);
            return arr;
        }

}
