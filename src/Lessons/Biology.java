package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Biology extends LessonClass {
    private ArrayList<String> topicList;

    public Biology(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Ecology", "Opportunities in Biology",
                "Principles of Biology 1",
                "Principles of Genetics"));
        return topicList;
    }


 /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Biology class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class

     Ecology
     Opportunities in Biology
     Principles of Biology 1
     Principles of Biology 2
     Principles of Genetics
     return topicList

     */


}
