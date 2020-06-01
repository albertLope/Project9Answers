package Lessons;

import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public class  LessonClass {

    int totalCreditCount;
    LinkedHashMap<String , Integer> classNameAndScore = new LinkedHashMap<>();
    StudentClass studentClass;

    public LessonClass(StudentClass studentClass){

        this.studentClass = studentClass;
        setCreditCount();

    }

    public void setCreditCount() {

        Scanner dp = new Scanner(System.in);

        while(totalCreditCount<=7){
            System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");
            System.out.println("your total credit is " + totalCreditCount);
            String lessonName = dp.nextLine();
            totalCreditCount+=getCredit(lessonName);
        }
    }



    public int getCredit(String lessonName){

        int result =  0 ;

        if(lessonName.equals("Math")){
            result = 3;
        }else if(lessonName.equals("Science")){
            result = 4;
        }else if(lessonName.equals("Biology")){
            result = 2;
        }else if(lessonName.equals("Chemistry")){
            result = 2;
        }else if(lessonName.equals("Music")){
            result = 3;
        }else{
            throw new RuntimeException("You class name is not a valid class name.");
        }

        classNameAndScore.put(lessonName , RandomNum());

        return result;

    }

    private int RandomNum(){

        Random rnd = new Random();

        return rnd.nextInt(100);
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }
}
