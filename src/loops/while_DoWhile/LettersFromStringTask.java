package loops.while_DoWhile;

import java.util.Scanner;

public class LettersFromStringTask {
    public static void main(String[] args) {

        //get a string from user and print out every letter from given string separated by comma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String str = scanner.nextLine();

        //System.out.println(str.charAt(2));
        int i = 0;
        while (i < str.length()){
            System.out.print(str.charAt(i)+", ");
            i++;
        }
        // print those letters in reverse order
        System.out.println();
        int lIndex = str.length()-1;
        while (lIndex >= 0){

            System.out.print(str.charAt(lIndex)+", ");
            lIndex--;
        }

    }
}
