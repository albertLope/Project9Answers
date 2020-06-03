package Lessons;

import Student.StudentClass;

import java.util.ArrayList;

public class Music extends LessonClass{
    /*
    Create a private String Arraylist name is topicList

    Music class is the child of the LessonClass

     add following values to arrayList in the override method
     Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!

     */
    private ArrayList<String> topicList = new ArrayList<>();

    @Override
    public ArrayList<String> topics() {
        topicList.add("Peacemaking Skills for Little Kids");
        topicList.add("Learning Through Literature");
        topicList.add("Creative Conflict Solving");
        topicList.add("Creating Peace, Building Community");
        topicList.add("WinWin!");


        return topicList;
    }

    public Music(StudentClass studentClass) {
        super(studentClass);
    }

}
