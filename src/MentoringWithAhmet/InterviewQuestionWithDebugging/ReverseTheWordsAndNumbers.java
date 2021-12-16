package MentoringWithAhmet.InterviewQuestionWithDebugging;

import java.util.Scanner;

public class ReverseTheWordsAndNumbers {
    //Ask the user to input a word and reverse it
    //Ask the user to input a number and reverse it

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.nextLine();
        //you have to know the meaning of the reverse( opposite) ahmet -->temha
        //HOW AM I GOING TO REVERSE A STRING ?
        //HOW CAN I REACH OUT EACH OF THE CHARACTERS FROM STRING?
        // WHERE AM I GOING TO STORE THEM AS REVERSE?

        // I think i should use the loop to reach out each element
        String name="";
        for(int i=word.length()-1; i>=0;i--){
           name+= word.charAt(i);
        }
        System.out.print(name);

        // HOMEWORK : DO THE NUMBER ONE(use int and reverse it)

        System.out.println();//1234667 --> 76654321 (DO IT WITH DEBUGGING)










    }



}
