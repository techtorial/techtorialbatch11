package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // use scanner to
        // get name  and DOB year of user
        // calculate user's age
        // print "<name> you are <age> years old"
      //  age  = current year - DOB(year)
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your birth year");
        int birthYear = scanner.nextInt();

        int age = 2021 - birthYear;
        System.out.println(name + " you are "+age+ " years old");

        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);
        int currentMinute = LocalDateTime.now().getMinute();
        System.out.println(currentMinute);

    }
}
