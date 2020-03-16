package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddSubtractTest {

    @Test
    public void addSubtract() {
        AddSubtract inst = new AddSubtract();

        int [] values = {5,4,2,1,3};

        String str = "ASA";

        int actual = inst.addSubtract(values, str);

        Assert.assertEquals("Result:", 8, actual);


    }

    @Test
    public void addSubtract1() {
        AddSubtract inst = new AddSubtract();

        int [] values = {11,1,3,15,21};

        String str = "AA";

        int actual = inst.addSubtract(values, str);

        Assert.assertEquals("Result:", 15, actual);


    }
}