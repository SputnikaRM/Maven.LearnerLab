package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students= Students.getInstance();
    Instructors instructors=Instructors.getINSTANCE();

    private final static ZipCodeWilmington zpw = new ZipCodeWilmington();

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getZPW (){
        return zpw;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Learner[] learners = new Learner[students.count()];
        Person[] persons = students.toArray();
        for (Integer index = 0; index < learners.length; index++)
            learners[index] = (Learner)persons[index];


        teacher.lecture(learners,numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Person teach = instructors.findById(id);
        hostLecture((Teacher)teach, numberOfHours);
    }

    public Map<Student,Double> getStudyMap() {
        HashMap<Student,Double> map = new HashMap<>();

        for(Object student: students){
            Student x=(Student) student;
            map.put(x,x.getTotalStudyTime());
        }
        return map;

    }



}
