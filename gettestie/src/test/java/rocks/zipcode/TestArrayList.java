package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {


    @Test
    public void testAdd() {
        ArrayList<String> list = new ArrayList<>();
        String valueToAdd = "New value";

        Assert.assertTrue(list.add(valueToAdd));
    }

    @Test
    public void testGet() {
        ArrayList<String> list = new ArrayList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);
        String actual = list.get(0);

        String expected = "New value";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testClear() {
        ArrayList<String> list = new ArrayList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        list.clear();
        Integer actual = list.size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty() {
        ArrayList<String> list = new ArrayList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);
        list.clear();

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIndexOf() {
        ArrayList<String> list = new ArrayList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        Integer expected = 0;
        Integer actual = list.indexOf(valueToAdd);

        Assert.assertEquals(expected, actual);
    }
}
