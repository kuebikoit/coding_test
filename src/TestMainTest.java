package coding_test.src;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

;


public class TestMainTest {


    @Test
    public void sum() {

        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();

        List<Integer> list= new ArrayList<Integer>();
       list.add(12);
       list.add(12);

        int expected= testMain.sum(list);
        int actual =24;

        Assert.assertEquals(expected,actual);


    }



    @Test
    public void reverse() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String expected= testMain.reverse("sunil");
        System.out.println(expected);
        String actual="linus";
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void reverse1() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String expected= testMain.reverse("");
        System.out.println(expected);
        String actual=null;
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void reverse2() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String expected= testMain.reverse(null);
        System.out.println(expected);
        String actual=null;
        Assert.assertEquals(actual, expected);


    }

    @Test
    public void printFizzBuzz() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();


        String result= testMain.printFizzBuzz(20);

        Assert.assertEquals("Buzz", result);


    }
    @Test
    public void printFizzBuzz1() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();


        String result= testMain.printFizzBuzz(15);
        Assert.assertEquals("FizzBuzz",result);


    }
    @Test
    public void printFizzBuzz3() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();


        String result= testMain.printFizzBuzz(0);
        Assert.assertEquals("0",result);


    }
    @Test
    public void printFizzBuzz2() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();


        String result= testMain.printFizzBuzz(7);
        Assert.assertEquals("7",result);


    }

    @Test
    public void findDuplicates() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String[] array={"one", "two", "four", "four"};
        HashSet<String> actual= new HashSet<>();
        actual= testMain.findDuplicates(array);
        HashSet<String> expected=new HashSet<>();
        expected.add("four");

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void findDuplicates1() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String[] array={"one", "two", "four", "four", "one", "two"};
        HashSet<String> actual= new HashSet<>();
        actual= testMain.findDuplicates(array);
        HashSet<String> expected=new HashSet<>();
        expected.add("one");
        expected.add("two");
        expected.add("four");

        Assert.assertEquals(expected, actual);


    }
    @Test
    public void findDuplicates2() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        String[] array={"one", "two", "four", "four","four", "one", "two"};
        HashSet<String> actual= new HashSet<>();
        actual= testMain.findDuplicates(array);
        HashSet<String> expected=new HashSet<>();
        expected.add("one");
        expected.add("two");
        expected.add("four");

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void swapAndPrint() {


        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        boolean actual= testMain.swapAndPrint(20,30);
        Assert.assertTrue(String.valueOf(true), actual);



    }
    @Test
    public void swapAndPrint1() {


        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        boolean actual= testMain.swapAndPrint(3,4);

        Assert.assertTrue(String.valueOf(true), actual);



    }

    @Test
    public void factorial() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        Integer actual= testMain.factorial(4);
        Integer expected=24;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void factorial1() {
        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        Integer actual= testMain.factorial(6);
        Integer expected=240;
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void max() {


        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        int [] array= {1,2,3,4,5,6};
        int expected=6;
        int actual= testMain.max(array);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void max1() {


        src.CUBICTEST.TestMain testMain= new src.CUBICTEST.TestMain();
        int [] array= {5,23,4,5,6};
        int expected=23;
        int actual= testMain.max(array);
        Assert.assertEquals(expected, actual);


    }
}