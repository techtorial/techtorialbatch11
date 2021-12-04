package Mentoring;

import java.util.Scanner;

public class StringTHreeWOrds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String threeWords = scanner.nextLine();
        System.out.println(threeWords);
// java script coding
// fist index always included but second index is not included
        int indexOfSpace = threeWords.indexOf(" ");
        System.out.println(indexOfSpace);
// returns the index of character we provided in method.
// charAt method returns the character of the index you provided,
        String firstWord = threeWords.substring(0,indexOfSpace);
        System.out.println(firstWord);
        // Removing the first word..
        String lastTwoWords= threeWords.substring(indexOfSpace+1);
// script coding
        System.out.println(lastTwoWords);
        int secondIOS=lastTwoWords.indexOf(" ");
        System.out.println(secondIOS);
        String secondWord = lastTwoWords.substring(0,secondIOS);
        System.out.println(secondWord);
      String thirdWord = lastTwoWords.substring(secondIOS);

      // What happens if we don't use ending index for substring?
        // it will start from the index we have provided and it will
        // go till end of the string.

    }
}
