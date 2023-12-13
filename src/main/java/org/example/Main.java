package org.example;

import org.lambdaAndApiStream.Item;
import org.lambdaAndApiStream.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "kike", LocalDate.of(1996, 4, 2));
        Person p2 = new Person(1, "Karla", LocalDate.of(1999, 9, 16));
        Person p3 = new Person(1, "Gisel", LocalDate.of(1997, 5, 23));

        Item item1 = new Item("iphone x", 8500, 10);
        Item item2 = new Item("iphone 15", 22999, 10);
        Item item3 = new Item("playStation 5", 18000, 8);
        Item item4 = new Item("smart TV Samsung", 25899, 3);


        List<Person> persons = Arrays.asList(p1, p2, p3);
        persons.forEach(person -> System.out.println(person.toString()));

        List<Item> items = Arrays.asList(item1, item2, item3, item4);
    }
}