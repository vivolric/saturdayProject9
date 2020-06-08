package TestClass;

import Lessons.LessonClass;
import Lessons.Music;
import Student.StudentClass;

public class MainClass {

    public static void main(String[] args) throws Exception {

        StudentClass studentClass = new StudentClass("Gerard", "Captain2005", "Portugal");
        //studentClass.setLocationList("Gerard");
        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the MainClass

        Result should be Exception in thread "main" java.lang.AssertionError: Location should be one of the following [USA, England, France, Germany, Canada]


         */
    }
}
