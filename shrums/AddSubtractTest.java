import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSubtractTest {
    AddSubtract as=new AddSubtract();
    @Test
    void addSubtractTest1() {
        int add = as.addSubtract(new int[]{10, 12, 113, 2, 15},"AASA");

        Assert.assertEquals(148,add );
    }
    @Test
    void addSubtractTest2() {
        int add = as.addSubtract(new int[]{10, 12, 113, 2, 15},"AASA");

        Assert.assertNotEquals("not expected",add );
    }

}