package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.KRIS instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student(101L, "John");

        Double expected = 0.5;
        Educator.KRIS.teach(student, expected);
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void testTeachTimeWorked() {
        Student student = new Student(101L, "John");

        Double expected = 0.5;
        Educator.DOLIO.teach(student, expected);
        Assert.assertEquals(expected, Educator.DOLIO.timeWorked);
    }

    @Test
    public void lecture() {
        Student[] students = {new Student(101L, "John"),
                new Student(102L, "Jane")};

        Double expected = 0.5 / students.length;
        Educator.FROILAN.lecture(students, 0.5);
        Assert.assertEquals(expected, students[0].getTotalStudyTime());
        Assert.assertEquals(expected, students[1].getTotalStudyTime());
    }

    @Test
    public void lectureTimeWorked() {
        Student[] students = {new Student(101L, "John"),
                new Student(102L, "Jane")};

        Double expected = 0.5;
        Educator.MELANIE.lecture(students, 0.5);
        Assert.assertEquals(expected, Educator.MELANIE.timeWorked);
    }

}