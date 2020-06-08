package Student;

import Data.StudentData;
import School.SchoolLocation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class StudentClass extends SchoolLocation {
    private String username, password;
    private LinkedHashMap<String, Integer> classNameAndScore;

    public StudentClass(String location) {
        super(location);
    }

    public StudentClass(String username, String password, String location) {
        super(location);
        setUsernamePassword(username, password);
    }

    public void setUsernamePassword(String userName, String passWord) {
        LinkedHashMap<String, String> checkUserNameAndPassword;
        StudentData studentData = new StudentData();
        checkUserNameAndPassword = studentData.AddUserNameAndPassword();

        //Set<String> names = checkUserNameAndPassword.keySet();
        //ArrayList<String> passes = (ArrayList<String>) checkUserNameAndPassword.values();

        boolean b1 = false;
        for (String name : checkUserNameAndPassword.keySet()) {
            if (name.equals(userName)) {
                if (passWord.equals(checkUserNameAndPassword.get(userName))) {
                    username = userName;
                    password = passWord;
                    b1 = true;
                }
            }
        }
        if (b1 == false) {
            throw new RuntimeException("Not able to find a username and password. Please sign up to website");
        }
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    @Override
    public String toString() {
        return "StudentClass " +
                " username= " + username +
                " password= " + password +
                " price = " + getPrice() +
                " School Location= " + getLocation() +
                " classNameAndScore= " + classNameAndScore +
                '}';
    }

    /*
    This class is child of the SchoolLocati on

    Create 3 private instance variables

    String username and password

    Linked hash map key is String value is Integer name is classNameAndScore

     */


     /*
        Create an constructor
        three parameter String username, String password and  String studentSchoolLocation

        Call the setUsernameAndPassword method in the constructor

     */

    /*
    Create a method name is  setUsernamePassword
    Parameter is String username and String  password
    no return type

    Check if given username and password pair exist in the StudentData class
    You will use AddUserNameAndPassword method to check it(create a new LinkedHashMap and make it equal to AddUserNameAndPassword from the StudentData class)
    if the pair exists,  make instance variable username equal to parameter username, and make instance variable password equal to parameter password

    if it doesn't not exist then throw an RunTimeException which is "Not able to find a username and password. Please sign up to website"
     */


    /*
        create a set method for the classNameAndScore
     */


    /*
        create a get method for the classNameAndScore
     */


    /*
    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */


}
