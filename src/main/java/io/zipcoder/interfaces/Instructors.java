package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super.add(new Instructor(1L,"Kris"));
        super.add(new Instructor(2L,"Dolio"));
        super.add(new Instructor(3L,"Froilan"));
        super.add(new Instructor(4L,"Melanie"));
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }
}
