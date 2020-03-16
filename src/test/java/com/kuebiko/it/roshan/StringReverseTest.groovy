package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class StringReverseTest {

        @Test
        void a() {
            StringReverse inst =new StringReverse();
            String input="HelloWorld";
            String ans=inst.reverse(input);
            Assert.assertEquals("dlroWolleH",ans)
        }

        @Test
        void b() {
            StringReverse inst =new StringReverse();
            String input="kcubic";
            String ans=inst.reverse(input);
            Assert.assertEquals("crbuck",ans)
        }





}
