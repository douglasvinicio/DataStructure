package Tests;

import Recursion.Exercise5;
import Tasks.CustomArray;
import org.junit.Assert;
import org.junit.Test;

public class ArraysTest {

    @Test
    public void addToArrayTest(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        String expected = "[10, 20, 30, 40]";

        Assert.assertEquals(expected,array.toString());
    }

    @Test
    public void deleteByIndexArrayTest(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        array.deleteByIndex(0);

        String expected = "[20, 30, 40]";

        Assert.assertEquals(expected,array.toString());
    }

    @Test
    public void deleteByValueArrayTest(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        array.deleteByValue(40);

        String expected = "[10, 20, 30]";

        Assert.assertEquals(expected,array.toString());
    }

    @Test
    public void insertValueAtIndex(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        array.insertValueAtIndex(15, 1);

        String expected = "[10, 15, 30, 40]";

        Assert.assertEquals(expected,array.toString());
    }

    @Test
    public void getValueArray(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        int expected01 = 20;
        int expected02 = 30;

        Assert.assertEquals(expected01,array.get(1));
        Assert.assertEquals(expected02,array.get(2));
    }

    @Test
    public void getSliceArrayTest(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);

        String expectedSlice = "[20, 30, 40]";

        Assert.assertEquals(expectedSlice,java.util.Arrays.toString(array.getSlice(1,3)));
    }

    @Test
    public void clearTest(){
        CustomArray array = new CustomArray();

        array.add(10);
        array.add(10);
        array.add(10);
        array.add(10);

        int expectedNumItems = 4;

        Assert.assertEquals(expectedNumItems,array.size());

        int expectedZero = 0;

        array.clear();

        Assert.assertEquals(expectedZero,array.size());

    }

}
