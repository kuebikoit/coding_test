package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class AddSubtractTest  {

    @Test
    void a() {
        AddSubtract inst = new AddSubtract();
        int []arr = [5, 4, 2, 1, 3];
        String str = "ASA";
        int finalValue = inst.addSubtract(arr,str);

        Assert.assertEquals(8,finalValue);

    }

    @Test
    void b() {
        AddSubtract inst = new AddSubtract();
        int []arr = [11, 1, 3, 15, 21];
        String str = "AA";
        int finalValue = inst.addSubtract(arr,str);

        Assert.assertEquals(10,finalValue);

    }


}
