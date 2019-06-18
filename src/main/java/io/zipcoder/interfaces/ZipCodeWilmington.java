package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    Students students= Students.getInstance();
    Instructors instructors=Instructors.getINSTANCE();

    private final static ZipCodeWilmington zpw = new ZipCodeWilmington();
    private ZipCodeWilmington () {

    }
    public static ZipCodeWilmington getZPW (){
        return zpw;
    }

    public void hostLecture (Teacher teacher, double numberOfHours) {
        teacher.lecture((Learner[])students.toArray(),numberOfHours );



    }

    public void hostLecture (long id, double numberOfHours){
        instructors.findById(id);
        Person teach = instructors.findById(id);
        


    }




}
