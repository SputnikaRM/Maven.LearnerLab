package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.zip.DeflaterOutputStream;

import static io.zipcoder.interfaces.ZipCodeWilmington.getZPW;
import static org.junit.Assert.*;

public class TestZipCodeWilmington {

    @Test

    public void testHostLecture (){
        //given


       ZipCodeWilmington testzipCodeWilmington = getZPW();

       testzipCodeWilmington.hostLecture(1L,4.0);

       Map<Student, Double> testMap = testzipCodeWilmington.getStudyMap();

       Students students = Students.getInstance();

       Student student7 = (Student)students.findById(7L);

       Double actual = testMap.get(student7);

        Assert.assertEquals(1.0, actual,0);

    }


}