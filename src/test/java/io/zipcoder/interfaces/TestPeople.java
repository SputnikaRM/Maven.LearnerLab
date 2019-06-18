package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPeople {

    @Test
    public void testAdd() {
        Instructor instructor = new Instructor(1L, "Smith");
        Student student = new Student(101L, "John");

        People people = new People();
        people.add(instructor);
        people.add(student);

        Assert.assertTrue(people.contains(instructor));
        Assert.assertTrue(people.contains(student));
    }

    @Test
    public void findById() {
        Long id = 1L;
        Instructor expected = new Instructor(id, "Smith");

        People people = new People();
        people.add(expected);

        Assert.assertEquals(expected, people.findById(id));
    }

    @Test
    public void testRemove() {
        Instructor instructor = new Instructor(1L, "Smith");

        People people = new People();
        people.add(instructor);
        people.remove(instructor);

        Assert.assertFalse(people.contains(instructor));

    }
}