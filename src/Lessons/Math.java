package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Math extends LessonClass{


    /*
    Create a private String Arraylist name is topicList

    Math class is the child of the LessonClass

     add following values to arrayList in the override method
     Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */
    private ArrayList<String> topicList = new ArrayList<>();

    @Override
    public ArrayList<String> topics() {
        topicList.add("Place Value");
        topicList.add("Compare Whole Numbers");
        topicList.add("Represent Decimals");
        topicList.add("Place Value through Thousandths");
        topicList.add("Multiplication Patterns");


        return topicList;
    }

    public Math(StudentClass studentClass) {
        super(studentClass);
    }

}
