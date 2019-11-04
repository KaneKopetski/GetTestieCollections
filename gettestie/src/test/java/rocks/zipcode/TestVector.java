package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void testAdd() {
        Vector<String> vector = new Vector();
        Assert.assertTrue(vector.add("Hello"));

    }

    @Test
    public void testClear() {
        Vector<String> vector = new Vector();
        vector.add("Hello");

        vector.clear();

        Integer expected = 0;
        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public  void testFirstElement() {
        Vector<String> vector = new Vector();
        vector.add("Hello");

        String expected = "Hello";
        String actual = vector.firstElement();

        Assert.assertEquals(expected, actual);

    }

}
