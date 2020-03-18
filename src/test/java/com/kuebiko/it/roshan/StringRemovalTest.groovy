package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class StringRemovalTest  {

    @Test
    void a() {

        StringRemoval inst  = new StringRemoval();
        String s1 = "HelloWorld";
        String s2 = "World";
        String finalOutput = inst.remove(s1,s2);
        Assert.assertEquals("Hello",finalOutput);

    }

    @Test
    void b() {

        StringRemoval inst  = new StringRemoval();
        String s1 = "JustDoIt";
        String s2 = "do";
        String finalOutput = inst.remove(s1,s2);
        Assert.assertEquals("JustIt",finalOutput);

    }


}
