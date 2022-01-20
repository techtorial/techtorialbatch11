package OOP.Abstraction.AbstractClasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

      //  Student student = new Student("vv",45); you cannot create object from Abstract class

        Map map = new LinkedHashMap();

        Student student = new OnlineStudent();

        OnlineStudent student1 = new OnlineStudent();



    }
}
