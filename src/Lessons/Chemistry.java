package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Chemistry extends LessonClass {
    private ArrayList<String> topicList;

    public Chemistry(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Pedagogy", "Prerequisites",
                "Course Offerings", "Safety",
                "General Chemistry"));
        return topicList;
    }
}

      /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Chemistry class is the child of the LessonClass

     add following values to arrayList(topicList) in the override method that comes from the abstract class
     Pedagogy
     Prerequisites
     Course Offerings
     Safety
     General Chemistry
     return topicList

     */



