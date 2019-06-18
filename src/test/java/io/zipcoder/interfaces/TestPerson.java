package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructorId() {
        Long expectedId = 1L;
        String name = "John";

        Person person = new Person(expectedId,name);
        Assert.assertEquals(expectedId,person.getId());
    }

    @Test
    public void testConstructorName() {
        Long id = 1L;
        String expectedName = "John";

        Person person = new Person(id,expectedName);
        Assert.assertEquals(expectedName,person.getName());
    }

    @Test
    public void testSetName() {
        Long id = 1L;
        String expectedName = "John";

        Person person = new Person(id,null);
        person.setName(expectedName);
        Assert.assertEquals(expectedName,person.getName());
    }
}
