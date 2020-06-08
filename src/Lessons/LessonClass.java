package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class LessonClass {
    private static int totalCreditCount;
    private LinkedHashMap<String, Integer> classNameAndScore = new LinkedHashMap<>();
    private StudentClass studentClass;

    public LessonClass(StudentClass studentClass) {

        this.studentClass = studentClass;
        setCreditCount();
    }

    public abstract ArrayList<String> topics();

    public void setCreditCount() {
        ArrayList<String> lessonName = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (totalCreditCount <= 7) {
            System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");
            //lessonName.add(input.nextLine());

            String checkName = input.nextLine();

            if (lessonName.contains(checkName)) {
                System.out.println("You already took this class, please choose other class");
            } else {
                lessonName.add(checkName);
                totalCreditCount += checkCredit(checkName);
            }
        }
    }


    public int checkCredit(String lessonName) {
        int credit = 0;
        if (lessonName.equalsIgnoreCase("Math")) {
            credit = 3;
        } else if (lessonName.equalsIgnoreCase("Science")) {
            credit = 4;
        } else if (lessonName.equalsIgnoreCase("Biology")) {
            credit = 2;
        } else if (lessonName.equalsIgnoreCase("Chemistry")) {
            credit = 2;
        } else if (lessonName.equalsIgnoreCase("Music")) {
            credit = 3;
        } else {
            throw new RuntimeException("Your class name is not a valid name");
        }
        classNameAndScore.put(lessonName, RandNum());
        return credit;
    }

    public int RandNum() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public LinkedHashMap<String, Integer> getClassNameAndScore() {
        return classNameAndScore;
    }



    /*
        LessonClass class is abstract class

        Create 2 private variables
        1) static int totalCreditCount
        2) LinkedHashMap Key is String, value is Integer, name is classNameAndScore

        one private StudentClass object.

     */

    /*
        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */

     /*
    Create a constructor for the LessonClass
    parameter is StudentClass object

    make StudentClass instance variable equal to StudentClass parameter

    call the setCreditCount method  which you are expected to create below
     */

   /*

    Create a method name setCreditCount
    No parameter and no return type

    Create an arraylist name is lessonsName
    Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
    After asking also add the credit to totalCreditCount(this comes from the instance variable)


    If the user took the class (you wrote in the console with the scanner class) is already exits in the arraylist and the user would like to take it again

    Then print "You already took this class please choose other class"

    If the user didn't take that class before, then add it to the arraylist, and add the credit of the class(which comes from the lessonsName list) to the
    totalCreditCount(you need to use checkCredit method)

    NOTE: The user can add a class until totalCreditCount equals to 7

     */

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
        Throw an exception "You class name is not a valid class name."

    After the if statement
     put lessonName as a key in the classNameAndScore
     value should take from the next method which is RandomNum
     */


    /*
    Create a method name is RandomNum
    no parameter
    Return type is int

    create an int number between 0 to 100
     */


    /*
    Create a get method for the ClassNameAndScore
     */

}
