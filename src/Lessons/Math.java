package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Math extends LessonClass {
    private ArrayList<String> topicList;

    public Math(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Place Value", "Compare Whole Numbers",
                "Represent Decimals", "Place Value through Thousandths",
                "Multiplication Patterns"));
        return topicList;
    }




   /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Math class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Place Value
     Compare Whole Numbers
     Represent Decimals
     Place Value through Thousandths
     Multiplication Patterns

     */

}
