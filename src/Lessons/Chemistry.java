package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Chemistry extends LessonClass{

    /*
    Create a private String Arraylist name is topicList

    Chemistry class is the child of the LessonClass

     add following values to arrayList in the override method
     Pedagogy
     Prerequisites
     Course Offerings
     Safety
     General Chemistry

     */
    private ArrayList<String> topicList = new ArrayList<>();

    @Override
    public ArrayList<String> topics() {
        topicList.add("Pedagogy");
        topicList.add("Prerequisites");
        topicList.add("Course Offerings");
        topicList.add("Safety");
        topicList.add("General Chemistry");

        return topicList;
    }

    public Chemistry(StudentClass studentClass) {
        super(studentClass);
    }

}
