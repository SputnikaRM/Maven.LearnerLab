package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {
    @Test
    public void testInstructors1(){
        Instructor instructor = (Instructor)Instructors.getINSTANCE().findById(1L);
        Assert.assertTrue(Instructors.getINSTANCE().contains(instructor));
    }

    @Test
    public void testInstructors2(){
        Instructor instructor = (Instructor)Instructors.getINSTANCE().findById(2L);
        Assert.assertTrue(Instructors.getINSTANCE().contains(instructor));
    }

    @Test
    public void testInstructors3(){
        Instructor instructor = (Instructor)Instructors.getINSTANCE().findById(3L);
        Assert.assertTrue(Instructors.getINSTANCE().contains(instructor));
    }

    @Test
    public void testInstructors4(){
        Instructor instructor = (Instructor)Instructors.getINSTANCE().findById(4L);
        Assert.assertTrue(Instructors.getINSTANCE().contains(instructor));
    }

    @Test
    public void testInstructorsAdd(){
        Instructor expected = new Instructor(5L, "Dan");
        Instructors.getINSTANCE().add(expected);
        Assert.assertTrue(Instructors.getINSTANCE().contains(expected));
    }

}