package Lessons;

import Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Science extends LessonClass {
    private ArrayList<String> topicList;

    public Science(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Animal Habitats",
                "Ball Launcher Challenge",
                "Balloon Car", "Bending Plant Roots with Gravity",
                "Birthday Season Weather Report"));
        return topicList;
    }

    /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Science class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Animal Habitats
     Ball Launcher Challenge
     Balloon Car
     Bending Plant Roots with Gravity
     Birthday Season Weather Report

     return topicList;

     */

}
