package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    @Test
    public void testPut() {
        Map<Person, Address> addressMap = new HashMap();
        Person person1 = new Person("Kane", 30);
        Address address1 = new Address("Lynam Lookout Drive", "Newark", "19702");
        addressMap.put(person1, address1);

        Integer actual = addressMap.size();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        Map<Person, Address> addressMap = new HashMap();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        Address address1 = new Address("Lynam Lookout Drive", "Newark", "19702");
        Address address2 = new Address("Oak Street", "Sanford", "04073");
        Address address3 = new Address("Graham Drive", "Wilmington", "19808");

        addressMap.put(person1, address1);
        addressMap.put(person2, address2);
        addressMap.put(person3, address3);

        addressMap.remove(person1, address1);

        Integer actual = addressMap.size();
        Integer expected = 2;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        Map<Person, Address> addressMap = new HashMap();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        Address address1 = new Address("Lynam Lookout Drive", "Newark", "19702");
        Address address2 = new Address("Oak Street", "Sanford", "04073");
        Address address3 = new Address("Graham Drive", "Wilmington", "19808");

        addressMap.put(person1, address1);
        addressMap.put(person2, address2);
        addressMap.put(person3, address3);

        Integer actual = addressMap.size();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testContainsKey() {
        Map<Person, Address> addressMap = new HashMap();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        Address address1 = new Address("Lynam Lookout Drive", "Newark", "19702");
        Address address2 = new Address("Oak Street", "Sanford", "04073");
        Address address3 = new Address("Graham Drive", "Wilmington", "19808");

        addressMap.put(person1, address1);
        addressMap.put(person2, address2);
        addressMap.put(person3, address3);

        Assert.assertTrue(addressMap.containsKey(person1));

    }

    @Test
    public void testClear() {
        Map<Person, Address> addressMap = new HashMap();
        Person person1 = new Person("Kane", 30);
        Person person2 = new Person("John", 31);
        Person person3 = new Person("Bob", 21);

        Address address1 = new Address("Lynam Lookout Drive", "Newark", "19702");
        Address address2 = new Address("Oak Street", "Sanford", "04073");
        Address address3 = new Address("Graham Drive", "Wilmington", "19808");

        addressMap.put(person1, address1);
        addressMap.put(person2, address2);
        addressMap.put(person3, address3);

        addressMap.clear();

        Integer actual = addressMap.size();
        Integer expected = 0;

        Assert.assertEquals(expected, actual);

    }
}
