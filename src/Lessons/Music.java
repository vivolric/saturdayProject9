package Lessons;

import Student.StudentClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Music extends LessonClass {
    private ArrayList<String> topicList;

    public Music(StudentClass studentClass) {
        super(studentClass);
    }

    @Override
    public ArrayList<String> topics() {
        topicList = new ArrayList<>(Arrays.asList("Peacemaking Skills for Little Kids",
                "Learning Through Literature",
                "Creative Conflict Solving", "Creating Peace, Building Community",
                "WinWin!"));
        return topicList;
    }

    /*
    This class child of the LessonClass

    Create a private String Arraylist name is topicList

    Music class is the child of the LessonClass

      add following values to arrayList(topicList) in the override method that comes from the abstract class
     Peacemaking Skills for Little Kids
     Learning Through Literature
     Creative Conflict Solving
     Creating Peace, Building Community
     WinWin!
return topicList
     */


}
