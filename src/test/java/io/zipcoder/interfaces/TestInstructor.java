package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(1L, "Smith");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(1L, "Smith");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(1L, "Smith");
        Student student = new Student(101L, "John");

        Double expected = 0.5;
        instructor.teach(student, expected);
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void lecture() {
        Instructor instructor = new Instructor(1L, "Smith");
        Student[] students = {new Student(101L, "John"),
                                new Student(102L, "Jane")};

        Double expected = 0.5 / students.length;
        instructor.lecture(students, 0.5);
        Assert.assertEquals(expected, students[0].getTotalStudyTime());
        Assert.assertEquals(expected, students[1].getTotalStudyTime());
    }
}