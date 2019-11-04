package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestIterator {

    @Test
    public void testIteratorArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator iterator = list.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
    }

    @Test
    public void testIteratorHashMap() {
        HashMap<Person, Address> map = new HashMap();
        Person person1 = new Person("Kane", 1989);
        Person person2 = new Person("Rachelle", 1989);
        Person person3 = new Person("Teddy Bear", 2012);

        Address address1 = new Address("51 Lynam Lookout Drive", "Newark", "19702");
        Address address2 = new Address("2211 Graham Drive", "Wilmington", "19808");
        Address address3 = new Address("480 Oak Street", "Sanford", "04073");

        map.put(person1, address1);
        map.put(person2, address2);
        map.put(person3, address3);


        Iterator<Map.Entry<Person, Address>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Person, Address> pair = (Map.Entry<Person, Address>) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
