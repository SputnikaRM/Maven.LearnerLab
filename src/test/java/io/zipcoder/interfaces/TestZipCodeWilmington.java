package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import static io.zipcoder.interfaces.ZipCodeWilmington.getZPW;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture (){
        //given


       ZipCodeWilmington testzipCodeWilmington = getZPW();

       testzipCodeWilmington.hostLecture(Educator.KRIS,4.0);

       Map<Student, Double> testMap = testzipCodeWilmington.getStudyMap();

       Students students = Students.getInstance();

       Student student7 = students.findById(7L);

       Double actual = testMap.get(student7);

        Assert.assertEquals(1.0, actual,0);

    }



}