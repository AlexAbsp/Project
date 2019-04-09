package Lesson8.home2;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        createHighestParent();
        createLowestChild();
    }


    public static Student createHighestParent() {
        Course[] coursesTaken = {null,null,null};
        Student student = new Student("Oleg", "konev", 2, coursesTaken);

        return student;

    }

    public static SpecialStudent createLowestChild() {
        Course[] coursesTaken = new Course[]{new Course(new Date(), "TestName", 10, "Teacher", new Student[]{})};
        return new SpecialStudent("Name","LastName",100, coursesTaken, 1001, "email");

       /* Student[] students = {createHighestParent()};

        Course course1 = new Course(new Date(), "history", 48, "victor", students);

        Course[] coursesTaken = {course1};

        SpecialStudent specialStudent1 = new SpecialStudent("Ivan", "Petrov", 2, coursesTaken, 12345, "");

        System.out.println(specialStudent1.lastName);
        return specialStudent1;  */
    }
}
