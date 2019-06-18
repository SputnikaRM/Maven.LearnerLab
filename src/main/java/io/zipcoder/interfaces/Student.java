package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {

    }

    public Double getTotalStudyTime() {
        return 0.0;
    }
}
