package TestClass;

import Lessons.LessonClass;
import Student.StudentClass;

public class MainClass5 {
    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("VanDijk", "Defend04","USA" );

        LessonClass lessonClass = new LessonClass(studentClass);


        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the main class
        Then Type the class names
        Math
        Biology
        Biology

        NOTE : In this point you should be able to see this message in the console : You already took this class please choose other class

        Chemistry
        Music

       StudentClass{username='VanDijk', password='Defend04'Price of the school is $8000Location of the school is USAClass names and score for it {Math=80, Biology=79, Chemistry=13, Music=87}}

         */
    }
}