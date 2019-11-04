package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");

        String expected = "Hello world";
        String actual = stack.pop();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        String string = "Hello world";

        String expected = "Hello world";
        String actual = stack.push(string);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");

        String expected = "Hello world";
        String actual = stack.peek();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEmpty() {
        Stack<String> stack = new Stack<>();

        Assert.assertTrue(stack.empty());


    }
}
