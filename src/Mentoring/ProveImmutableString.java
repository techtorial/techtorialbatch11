package Mentoring;

public class ProveImmutableString {

    // Can you prove with the code that String in java is immutable?
    public static void main(String[] args) {
        String s1 = "java"; // In string pool java will be created
        String s2 = s1;   // s2 willl not create it will just point the java
        System.out.println(s1==s2);

        s1 ="new"; // In string pool new will be created
        System.out.println(s1==s2);



    }
}
