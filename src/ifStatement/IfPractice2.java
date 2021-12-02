package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        // assume that user is using military style time 1 - 24
        // print out good morning / good afternoon
        // for the hours of morning or afternoon or evening
        // ask user to enter only hour for the time
        // if the hour is less than 12 print good morning
        // if the hour is more than 12 less than 18  print good afternoon
        // if the hour is more than 18 print good evening

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter hour as: 0 - 23 ");

        int hour = (int)sc.nextDouble();

        if (hour < 12 && hour >=0){
            System.out.println("Good morning");
        }
        if (hour >=12 && hour < 18){

            System.out.println("Good afternoon");
        }
        if (hour>=18 && hour < 24){

            System.out.println("Good evening");
        }
        if (hour < 0 || hour > 23){
            System.out.println("check your time");
        }
    }
}
