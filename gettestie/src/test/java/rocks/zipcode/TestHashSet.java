package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    @Test
    public void testAdd() {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        Integer actual = personSet.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        personSet.remove(person2);

        Integer actual = personSet.size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        Integer actual = personSet.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testContains() {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        Assert.assertTrue(personSet.contains(person3));

    }

    @Test
    public void testToString() {
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        String expected = "[Name: Bob\nYear of birth: 21\n, Name: John\nYear of birth: 31\n, Name: Kane\nYear of birth: 30\n]";
        String actual = personSet.toString();

        Assert.assertEquals(expected, actual);
    }
}
