package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudents {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStudent (){
        Student testStudent = Students.getInstance().findById(9L);
        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void TestStudent2() {
        Student testStudent = Students.getInstance().findById(7L);
        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void TestStudent3(){
        Student testStudent = Students.getInstance().findById(5L);
        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }

    @Test
    public void TestStudent4(){
        Student testStudent = Students.getInstance().findById(3L);
        Assert.assertTrue(Students.getInstance().contains(testStudent));
    }
}