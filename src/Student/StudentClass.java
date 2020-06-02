package Student;

import Data.StudentData;
import School.SchoolLocation;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation{

    /*
    This method child of the SchoolLocation

    Create 3 instance variable

    String username and password

    Linked hash map key is String value is Integer name is classNameAndScore

     */
    String username;
    String password;
    LinkedHashMap<String , Integer> classNameAndScore = new LinkedHashMap<>();

    /*
        Create an constructor
        three parameter String username password and studentSchoolLocation

        Call the setUsernameAndPassword method in the constructor

     */
    public StudentClass(String username , String password , String studentSchoolLocation ){
        super(studentSchoolLocation);

        setUsernamePassword(username , password);

    }

    /*
    Create a method name is  setUsernamePassword
    Parameter is String username password
    no return type

    Check is given username and password pair exist in the Student data class

    if it is not exist then throw error which is "Not able to find a username and password. Please sign up to website"
     */

    public void setUsernamePassword(String username , String password){

        StudentData studentData = new StudentData();

        LinkedHashMap<String,String > usernamePassword = new LinkedHashMap<>();

        usernamePassword = studentData.AddUserNameAndPassword();

        boolean res = false;

        for(String userN  : usernamePassword.keySet()){
            if(userN.equals(username)){
                Assert.assertEquals(password , usernamePassword.get(userN));
                this.username = username;
                this.password = password;
                res = true;
            }
        }

        if(!res){
            Assert.fail("Not able to find a username and password. Please sign up to website");

        }
    }

    /*
        create a set method for the classNameAndScore
     */
    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    /*
        create a get method for the classNameAndScore
     */
    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          all class names and scores
     */
    @Override
    public String toString() {
        return "StudentClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                "Price of the school is "+ getPrice()+
                "Location of the school is " + getLocation()+
                "Class names and score for it "+  getClassNameAndScore()+
                '}';
    }
}
