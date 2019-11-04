package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testAdd() {
        TreeSet<String> treeSet = new TreeSet();
        String string = "Hello";
        Assert.assertTrue(treeSet.add(string));

    }

    @Test
    public void testRemove() {
        TreeSet<String> treeSet = new TreeSet();
        String string = "Hello";
        treeSet.add(string);

        Assert.assertTrue(treeSet.remove(string));

    }

    @Test
    public void testSize() {
        TreeSet<String> treeSet = new TreeSet();
        String string = "Hello";
        treeSet.add(string);

        Integer expected = 1;
        Integer actual = treeSet.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testContains() {
        TreeSet<String> treeSet = new TreeSet();
        String string = "Hello";
        treeSet.add(string);

        Assert.assertTrue(treeSet.contains(string));

    }

    @Test
    public void testToString() {
        TreeSet<String> treeSet = new TreeSet();
        String string = "Hello";
        treeSet.add(string);

        String expected = "[Hello]";
        String actual = treeSet.toString();

        Assert.assertEquals(expected, actual);

    }
}
