package Tests;

import Recursion.Exercise5;
import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {
    @Test
    public void testChangeXY(){
        Exercise5 app = new Exercise5();
        String output = app.changeXY("CCCCCxRxY");
        Assert.assertEquals("CCCCCyRyY", output);
    }

}
