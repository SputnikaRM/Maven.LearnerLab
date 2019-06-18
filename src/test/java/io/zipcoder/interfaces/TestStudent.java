package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestLearn() {
        // given
        Student testStudent = new Student(null,"Jo Anna");


        double expected = 10.0;

        //when
         testStudent.learn(10.0);
         //
        Assert.assertEquals(expected,testStudent.getTotalStudyTime(),0.01);

    }

    @Test
    public void testInheritance () {
        Person student = (Person)(Object)new Student(null,null);
        Assert.assertTrue(student instanceof Person);

    }

    @Test

    public void testImplementation () {
        Learner student = (Learner)(Object)new Student(null,null);

        Assert.assertTrue(student instanceof Learner);
    }
}