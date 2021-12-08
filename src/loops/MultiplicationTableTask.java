package loops;

import java.util.Scanner;

public class MultiplicationTableTask {
    public static void main(String[] args) {
        /*
        ask user to provide a whole integer number
           create a multiplication table from 1 to 10 for the given number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int number = scanner.nextInt();

        // 4 * 1 = 4
//        System.out.println(number + " * " + 1 + " = " + (number * 1));
//        System.out.println(number + " * " + 2 + " = " + (number * 2));
        int a = 1;
        while ( a <=10 ){

            System.out.println(number + " * " + a + " = " + (number * a));

            a++;
        }


    }
}
