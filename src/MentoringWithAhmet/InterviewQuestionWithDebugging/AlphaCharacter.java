package MentoringWithAhmet.InterviewQuestionWithDebugging;

public class AlphaCharacter {
    //PRINT OUT ALPHABETICAL,DIGIT, AND SPECIAL CHARACTERS FROM
    //THE STRING SEPERATELY
    //String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
    //1-Print out alphacharacter
    //2-Print out digit
    //3-Print out special character
    //main method
    public static void main(String[] args) {
        //what am I supposed to in here
        //We have a string an you are supposed to seperate the characters from
        //each other
        //HOw can i solve this problem
        //How you can reach out the characters one by one
        //I can use for loop
        //then go ahead
        //How can i identify this character is alphabetic, digit or special.
        // you can either go with Character.isAlphabetical or Isdigit method
        // or you can go with 'a'<= to 'z' or 'A' to 'Z'

        String given="ertwsaFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabetical="";
        String onlyDigit="";
        String onlySpecial="";
        for(int i = 0; i<given.length();i++){
            if(Character.isAlphabetic(given.charAt(i))){
                onlyAlphabetical+=given.charAt(i);
            }else if(Character.isDigit(given.charAt(i))){
                onlyDigit+=given.charAt(i);
            }else{
                onlySpecial+=given.charAt(i);
            }
        }
        System.out.println(onlyAlphabetical);
        System.out.println(onlyDigit);
        System.out.println(onlySpecial);
    }
}
