package Mentoring;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        // How can we remove in the string
        // substring
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String firstLetter = ""+ str.charAt(0);
        String secondLetter = ""+ str.charAt(1);
        if(firstLetter.equals("x")&&secondLetter.equals("x")){
            System.out.println(str.substring(2));
        }else if (firstLetter.equals("x")){
            System.out.println(str.substring(1));

        }else if(secondLetter.equals("x")){
            System.out.println(str.substring(0,1)+str.substring(2));
        }

    }
}
//    Given a string, if one or both of the first 2 chars is 'x', print the
//        string without those 'x' chars, and otherwise print the string
//        unchanged.
//        Examples:
//
//        "xHi" → "Hi"
//        "Hxi" → "Hi"
//        "Tesxt" → "Testxt"