package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students= Students.getInstance();
    Instructors instructors=Instructors.getINSTANCE();

    private final static ZipCodeWilmington zpw = new ZipCodeWilmington();

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getZPW() {
        return zpw;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
//        Learner[] learners = new Learner[students.count()];
//        Person[] persons = students.getArray();
//        for (Integer index = 0; index < learners.length; index++)
//            learners[index] = (Learner)persons[index];


        teacher.lecture(students.getArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
//        Person teach = instructors.findById(id);
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public Map<Student,Double> getStudyMap() {
        HashMap<Student,Double> map = new HashMap<>();

        for(Student student: students){
            map.put(student,student.getTotalStudyTime());
        }
        return map;

    }



}
