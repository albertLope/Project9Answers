package TestClass;

import Lessons.LessonClass;
import Student.StudentClass;

public class MainClass3 {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Gerard", "Captain2005","France" );

        LessonClass lessonClass = new LessonClass(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the main class
        Math
        Music
        Art
            Exception in thread "main" java.lang.RuntimeException: You class name is not a valid class name.
         */
    }
}

