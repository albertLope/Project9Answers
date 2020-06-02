package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Biology extends LessonClass{


    /*
    Create a private String Arraylist name is topicList

    Biology class is the child of the LessonClass

     add following values to arrayList in the override method
     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics

     */
    private ArrayList<String> topicList = new ArrayList<>();

    @Override
    public ArrayList<String> topics() {
        topicList.add("Ecology");
        topicList.add("Opportunities in Biology");
        topicList.add("Principles of Biology 1");
        topicList.add("Principles of Biology 2");
        topicList.add("Principles of Genetics");

        return topicList;
    }

    public Biology(StudentClass studentClass) {
        super(studentClass);
    }


}
