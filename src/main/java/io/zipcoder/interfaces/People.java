package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable<E> {
    protected List<E> personList = new ArrayList<>();

    public Boolean add(E person) {
       return personList.add(person);
    }

    public E findById(Long id) {
        for (E person : personList)
            if (person.getId().equals(id))
                return person;
        return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public Boolean remove(E person) {
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

    public abstract E[] getArray();

    public Iterator iterator() {
        return personList.iterator();
    }
}
