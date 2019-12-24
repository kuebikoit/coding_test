package CubicTest;

import static org.junit.Assert.*;

public class factorialTest {

    public void factorCheck(){
        factorial r = new factorial();
        int result= r.factorialNum(8);
        int resultCheckValue= 4032;
       assertEquals(result,resultCheckValue);


    }
}