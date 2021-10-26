package com.zahid.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zahid.human.Person;

public class SortPersonExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        
        personList.add(new Person("Alex", 28));
        personList.add(new Person("Lee", 24));
        personList.add(new Person("Cooper", 30));
        personList.add(new Person("John", 21));
        personList.add(new Person("Done", 27));
        personList.add(new Person("Jane", 25));

        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);
        
        for(Person person: personList) {
            System.out.println(person);
        }
    }
}
