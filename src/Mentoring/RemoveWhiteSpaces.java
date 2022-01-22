package Mentoring;

public class RemoveWhiteSpaces {


    // What is white space?
    // " " "\n" "\r" "\t"
    public static  String removeWhiteSpaces(String str ){
        // char array out of string
        char [] charArray = str.toCharArray();
        String withoutWhiteSpace = "";
        for (int i = 0; i <charArray.length ; i++) {
            if(!Character.isWhitespace(charArray[i])){
                withoutWhiteSpace+=charArray[i];
            }
        }

        return withoutWhiteSpace;

    }
}
