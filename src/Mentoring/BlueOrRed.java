package Mentoring;

import java.util.Locale;
import java.util.Scanner;

public class BlueOrRed {
    // string.contains("blue")
    // individual letters
    // b.dsklbue
    // I have to use index of method
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.next().toLowerCase();
    if (str.contains("b")&&str.contains("l")&&str.contains("u")&&str.contains("e")){
        int indexB = str.indexOf("b");// 1
        int indexL = str.indexOf("l",indexB);// 0
        int indexU  =str.indexOf("u",indexL);
        int indexE = str.indexOf("e",indexU);
        // I have to look index of l after b
        //lblube
        if (indexB<indexL&&indexL<indexU&&indexU<indexE){
            System.out.println("blue");
        }


        Methods methods = new Methods();
    }

}}
//    Using the scanner ask the user to enter any String value. If this
//        String has a color like red or blue with lower case print the red or
//        blue. Other wise do not print anything.
//        But in the words b has to come first then the other letters
//        EXAMPLE-1:
//        Input: "xxderyy"
//        Output: red
//        EXAMPLE-2:
//        Input: "xbxltue"
//        Output: blue

