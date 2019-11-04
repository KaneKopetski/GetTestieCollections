package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testPut() {
        TreeMap<String, String> treeMap = new TreeMap();

        String expected = null;
        String actual = treeMap.put("Hello", "Goodbye");


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Hello", "Goodbye");

        String expected = "Goodbye";
        String actual = treeMap.remove("Hello");


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Hello", "Goodbye");

        Integer expected = 1;
        Integer actual = treeMap.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testContainsKey() {
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Hello", "Goodbye");

        Assert.assertTrue(treeMap.containsKey("Hello"));

    }

    @Test
    public void testClear() {
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Hello", "Goodbye");

        treeMap.clear();

        Integer expected = 0;
        Integer actual = treeMap.size();

        Assert.assertEquals(expected, actual);

    }
}
