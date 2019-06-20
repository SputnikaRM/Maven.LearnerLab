package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super.add(Educator.KRIS.instructor);
        super.add(Educator.DOLIO.instructor);
        super.add(Educator.FROILAN.instructor);
        super.add(Educator.MELANIE.instructor);

//        super.add(new Instructor(1L,"Kris"));
//        super.add(new Instructor(2L,"Dolio"));
//        super.add(new Instructor(3L,"Froilan"));
//        super.add(new Instructor(4L,"Melanie"));
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
