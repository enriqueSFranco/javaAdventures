package org.lambdaandapistream;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaAndStream {
    private List<Person> persons;
    private List<Item> items;

    public LambdaAndStream() {
        persons = Arrays.asList(
                new Person(1, "kike", LocalDate.of(1996, 4, 2)),
                new Person(2, "Karla", LocalDate.of(1999, 9, 16)),
                new Person(3, "Gisel", LocalDate.of(1997, 5, 23))
        );

        items = Arrays.asList(
                new Item("iphone x", 8500, 10),
                new Item("iphone 15", 22999, 10),
                new Item("playStation 5", 18000, 8),
                new Item("smart TV Samsung", 25899, 3)
        );
    }

    //persons.forEach(person -> System.out.println(person.toString()));
    //persons.forEach(System.out::println);

    // Filter (param: predicadee)
    public void filteredPersons() {
        this.persons.stream()
            .filter(person -> Period.between(person.getBirthdate(), LocalDate.now()).getYears() >= 18)
            .toList()
            .forEach(person -> System.out.println(person.toString()));
    }

    // Map (param: function)
    public void mappedPersons() {
        Function<String, String> codeFunction = name -> STR."Code \{name}";
        this.persons.stream()
                .map(Person::getName)
                .map(codeFunction)
                .forEach(System.out::println);
    }

    public void filterAndMappedPersons() {
        //List<String> users = Arrays.asList("Ana", "Juan", "Elena", "Carlos");
        this.persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .map(person -> person.getName().toUpperCase())
                .forEach(System.out::println);
    }

}
