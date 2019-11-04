package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void testAdd() {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        String string = "String";
        Assert.assertTrue(priorityQueue.add(string));

    }

    @Test
    public void testPeek() {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        String string = "String to add";
        priorityQueue.add(string);

        String actual = priorityQueue.peek();
        String expected = string;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        String string = "String to add";
        priorityQueue.add(string);

        Integer expected = 1;
        Integer actual = priorityQueue.size();

        Assert.assertEquals(expected, actual);

    }


}
