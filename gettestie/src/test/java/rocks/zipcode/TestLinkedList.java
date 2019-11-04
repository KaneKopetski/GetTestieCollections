package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testAdd() {
        LinkedList<String> list = new LinkedList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        Integer expected = 1;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGet() {
        LinkedList<String> list = new LinkedList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        String expected = "New value";
        String actual = list.get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testClear() {
        LinkedList<String> list = new LinkedList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        list.clear();

        Integer expected = 0;
        Integer actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testIsEmpty() {
        LinkedList<String> list = new LinkedList<>();
        Assert.assertTrue(list.isEmpty());

    }

    @Test
    public void testIndexOf() {
        LinkedList<String> list = new LinkedList<>();
        String valueToAdd = "New value";
        list.add(valueToAdd);

        Integer expected = 0;
        Integer actual = list.indexOf(valueToAdd);

        Assert.assertEquals(expected, actual);

    }

}
