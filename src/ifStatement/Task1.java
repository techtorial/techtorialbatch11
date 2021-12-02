package ifStatement;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");

        String word = input.nextLine().toUpperCase();

        if (word.startsWith("M")){

            System.out.println("Monday");
        }
        if (word.startsWith("T")){
            System.out.println("Tuesday/Thursday");
        }
        if (word.startsWith("W")){
            System.out.println("Wednesday");
        }
        if (word.startsWith("F")){
            System.out.println("Friday");
        }
        if (word.charAt(0) == 'S'){
            System.out.println("Saturday/Sunday");
        }
        if  (!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") &&
        !word.startsWith("F") && !word.startsWith("S")){
            System.out.println("There is no day!!!");
        }

    }
}
