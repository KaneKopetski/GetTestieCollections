package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void testAdd() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        Assert.assertTrue(integers.add(1));

    }

    @Test
    public void testGetFirst() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(1);

        Integer actual = integers.getFirst();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testClear() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(1);

        integers.clear();

        Integer expected = 0;
        Integer actual = integers.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testIsEmpty() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();

        Assert.assertTrue(integers.isEmpty());

    }

    @Test
    public void testPeek() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Integer actual = integers.peek();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers.toString());
    }
}
