package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    @Test
    public void testComparable1() {
        ArrayList<Person> list = new ArrayList();
        Person person1 = new Person("Kane", 1989);
        Person person2 = new Person("Rachelle", 1989);
        Person person3 = new Person("Teddy", 2012);
        Person person4 = new Person("Bill", 1954);
        Person person5 = new Person("Janice", 1000);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        Collections.sort(list);

        for (Person person : list) {
            System.out.println(person.getName());
        }
    }
}
