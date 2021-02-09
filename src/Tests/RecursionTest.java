package Tests;

import Recursion.Exercise5;
import Tasks.CustomArray;
import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {
    @Test
    public void testChangeXY(){
        Exercise5 app = new Exercise5();
        String output = app.changeXY("CCCCCxRxY");
        Assert.assertEquals("CCCCCyRyY", output);
    }

    @Test
    public void GetSliceTest(){
        CustomArray array = new CustomArray();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        int[] slice = array.getSlice(0,1);
        int[] result = {10};
        Assert.assertEquals(slice,result);

    }

}
