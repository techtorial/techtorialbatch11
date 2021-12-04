package ifStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {


        // city
        // school
        //batch

        System.out.println("Which city you live in?");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("chicago")){
            System.out.println("Which course are you attending?");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("techtorial")){
                System.out.println("Which batch are you in?");
                String batch = scanner.nextLine();
                if (batch.equalsIgnoreCase("11")){
                    System.out.println(" It is getting easier!!!");
                }else{
                    System.out.println("Congrats you already done!");
                }
            }else{

                System.out.println("We are at Des Plains, please visit us");
            }

        }else{
        // this is checking city
            System.out.println("Please come to Chicago, you will like it in the summer");
        }

    }
}
