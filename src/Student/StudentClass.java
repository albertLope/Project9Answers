package Student;

import Data.StudentData;
import School.SchoolLocation;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation{

    String username;
    String password;
    LinkedHashMap<String , Integer> classNameAndScore = new LinkedHashMap<>();

    public StudentClass(String username , String password , String studentSchoolLocation ){
        super(studentSchoolLocation);

        setUsernamePassword(username , password);

    }


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

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

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
