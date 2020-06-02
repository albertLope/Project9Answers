package TestClass;

import Lessons.LessonClass;
import Student.StudentClass;

public class MainClass4 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("David", "Villa","England" );

        LessonClass lessonClass = new LessonClass(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*

        Run the main class

        Result should be
         Exception in thread "main" java.lang.AssertionError: Not able to find a username and password. Please sign up to website

         */
    }
}

