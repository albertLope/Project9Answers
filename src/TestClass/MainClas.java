package TestClass;

import Lessons.LessonClass;
import Student.StudentClass;

import java.util.ArrayList;

public class MainClas {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Origi", "CornerTakenQuickly","England" );

        LessonClass lessonClass = new LessonClass(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);

    }
}
