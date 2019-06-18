package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    private List<Person> personList = new ArrayList<>();

    public Boolean add(Person person) {
       return personList.add(person);
    }

    public Person findById(Long id) {
        for (Person person : personList)
            if (person.getId().equals(id))
                return person;
        return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public Boolean remove(Person person) {
        return personList.remove(person);
    }

    public Boolean remove(Long id) {
        return remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    public Iterator iterator() {
        return personList.iterator();
    }
}
