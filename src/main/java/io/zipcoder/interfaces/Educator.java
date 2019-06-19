package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRIS(new Instructor(1L,"Kris")),
    DOLIO(new Instructor(2L,"Dolio")),
    FROILAN(new Instructor(3L,"Froilan")),
    MELANIE(new Instructor(4L,"Melanie"));
    final Instructor instructor;

    Educator(Instructor instructor){
        this.instructor = instructor;
        Instructors.getINSTANCE().add(instructor);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {

    }
}
