package io.zipcoder.interfaces;

public final class Students extends People {
    private final static Students Instance = new Students();

    private Students (){
        super.add(new Student(9L,"Jo anna"));
        super.add(new Student(7L,"Sput nika"));
        super.add(new Student(5L, "Will iam"));
        super.add(new Student (3L,"Cal eb"));
    }

    public static Students getInstance() {
        return Instance;
    }
}
