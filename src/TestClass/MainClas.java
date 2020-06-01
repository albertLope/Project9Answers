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


        /*
        Run the main class
        Then Type the class names
        Math
        Science
        Music

        Result should be like this
        StudentClass{username='Origi', password='CornerTakenQuickly'Price of the school is £6500Location of the school is EnglandClass names and score for it {Math=32, Science=59, Music=7}}


         */
    }
}
