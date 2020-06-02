package Lessons;

import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class LessonClass {

    /*
        LessonClass class is abstract class

        Create a 2 private variables
        static int totalCreditCount
        LinkedHashMap Key is String values is String name is classNameAndScore

        one private Student class object.

     */
    private static int totalCreditCount;
    private LinkedHashMap<String , Integer> classNameAndScore = new LinkedHashMap<>();
    private StudentClass studentClass;

    /*
        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */
    public abstract ArrayList<String> topics();

    /*
    Create a constructor for the StudentClass

    make StudentClass instance variable equal to student class parameter

    call the setCreditCount method
     */
    public LessonClass(StudentClass studentClass){
        this.studentClass = studentClass;
        setCreditCount();
    }

    /*

    Create a method name setCreditCount
    No parameter no return type

    Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
    print the current totalCreditCount

    If the user took the Math class in first option and the user would like to take it again
    Then print "You already took this class please choose other class"

    If the user didnt take that class before then add it in the arraylist

    NOTE: until the totalCreditCount become more then 7 user need to add the class


     */
    public void setCreditCount() {

        Scanner dp = new Scanner(System.in);

        ArrayList<String> lessonsName = new ArrayList<>();

        int i =0;
        while(totalCreditCount<=7){
            System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");
            System.out.println("your total credit is " + totalCreditCount);
            String className =dp.nextLine();

            if(lessonsName.contains(className)) {
                System.out.println("You already took this class please choose other class");
            }else{
                lessonsName.add(className);
                totalCreditCount += checkCredit(lessonsName.get(i));
                i++;

            }
        }
    }

    /*
    Create a method name is checkCredit
    parameter is one String lessonName
    return type is int

    IF the lessonName = Math
     credit should be 3

     IF the lessonName = Science
     credit should be 4

      IF the lessonName = Biology
     credit should be 2

      IF the lessonName = Chemistry
     credit should be 2

      IF the lessonName = Music
     credit should be 3

     if the class is non of these options
        Throw an error "You class name is not a valid class name."

     put lessonName as a key in the classNameAndScore
     value should take from the next method
     */
    public int checkCredit(String lessonName){

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

    /*
    Create a method name is RandomNum
    no parameter
    Return type is int

    create an int number between 0 to 100
     */
    private int RandomNum(){

        Random rnd = new Random();

        return rnd.nextInt(100);
    }

    /*
    Create a get method for the ClassNameAndScore
     */
    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }
}
