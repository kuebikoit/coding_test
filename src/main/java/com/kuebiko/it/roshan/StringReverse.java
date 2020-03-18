package com.kuebiko.it.roshan;

/**
 * Reverse string
 *
 */
public class StringReverse {




        public  String reverse(String input){

            int size=input.length();
            /*Since array index starts from 0 to one less than size of array */
            int reverseIndex=size-1;
            char []reverseString=new char[size];


            /* Storing string into char array to take manipulate each character's position */
                 for(int i=0;i<size;i++){
                        reverseString[i]=input.charAt(i);
                 }

                 for(int j=0;j<size;j++){
                        reverseString[j]=input.charAt(reverseIndex);
                        reverseIndex--;
                 }

                 String finalOutput=new String(reverseString);

                return  finalOutput;


        }




}
