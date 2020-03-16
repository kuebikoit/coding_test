package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelConsonantTest {

    @Test
    public void countVowelConsonant() {

        CountVowelConsonant inst = new CountVowelConsonant();

        String str = "HelloWorld";

        int [] exp = inst.countVowelConsonant(str);
        int [] counter = {3,7};

        Assert.assertArrayEquals(exp,counter);

    }

    @Test
    public void countVowelConsonant1() {

        CountVowelConsonant inst = new CountVowelConsonant();

        String str = "kuebikoIt";

        int [] exp = inst.countVowelConsonant(str);
        int [] counter = {5,4};

        Assert.assertArrayEquals(exp,counter);

    }




}