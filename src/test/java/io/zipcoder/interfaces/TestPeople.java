package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void testAdd() {
        Instructor instructor = new Instructor(100L, "Smith");

        People people = Instructors.getINSTANCE();
        people.add(instructor);

        Assert.assertTrue(people.contains(instructor));
    }

    @Test
    public void findById() {
        Long id = 200L;
        Instructor expected = new Instructor(id, "John");

        People people = Instructors.getINSTANCE();
        people.add(expected);

        Assert.assertEquals(expected, people.findById(id));
    }

    @Test
    public void testRemove() {
        Instructor instructor = new Instructor(1L, "Smith");

        People people = Instructors.getINSTANCE();
        people.add(instructor);
        people.remove(instructor);

        Assert.assertFalse(people.contains(instructor));

    }
}