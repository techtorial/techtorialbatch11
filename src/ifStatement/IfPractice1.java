package ifStatement;

import java.util.Scanner;

public class IfPractice1 {

    public static void main(String[] args) {
        // get a number between 1 to 7  from user
        // print the name of the day for that given number from user
        // 1  --> Monday
        // 2  --> Tuesday
        // ......
        // 7  --> Sunday
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 to 7");

        double  num= scanner.nextDouble();
        int number = (int)num;

        if(number ==1){
            System.out.println("Monday");
        }
        if (number == 2){
            System.out.println("Tuesday");
        }
        if (number == 3){
            System.out.println("Wednesday");
        }
        if (number == 4){
            System.out.println("Thursday");
        }
        if (number == 5){
            System.out.println("Friday");
        }
        if (number == 6){
            System.out.println("Saturday");
        }
        if (number == 7){
            System.out.println("Sunday");
        }

        // if the user enters out of range number
        // print your number is out of range
        if (number > 7  || number < 1){
            System.out.println("your entry is out of range");
        }
    }
}
