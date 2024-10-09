package org.example;

import org.example._2024_02_01.Person;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayFilter {

    public static <T> T[] arrayFilter(T[] arr, Predicate<T> predicate) {
        return Arrays.stream(arr).filter(predicate)
                .toArray(size -> (Arrays.copyOf(arr, size)));
    }

    public static void main(String[] args) {

        Person person1 = new Person("aloha", 21);
        Person person2 = new Person("aloha", 31);
        Person[] people = {person1, person2};
        Predicate<Person> predicatePerson = p -> p.getAge() > 30;
        System.out.println(arrayFilter(people, predicatePerson).getClass());
    }
}
