package string;

import java.util.Scanner;

public class PracticeChar {


    // abcdefghijklmnopqrstuvwxyz
    // If the user enters char that is not an English letter
    // code should print false
    // If user enters English letter code should print true
    public static void main(String[] args) {
        // ASCII table
        // The table that all chars has a unique value
//int charValueA = 'a';
//        System.out.println(charValueA);
//        char a = 97;
//        char a2 = 'a';
        System.out.println("Please enter a char letter");
        char ch = 'Y';
        // if this ch is a letter or not.
        // If the value of the char between char a and char z
        // it means this char is a letter
        boolean isLetter = ch>='a'&&ch<='z'||ch>='A'&&ch<='Z';
        System.out.println(isLetter);




    }

}
