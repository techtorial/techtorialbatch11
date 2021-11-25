package string;

import java.util.Scanner;

public class ScannerPractice4 {
    // Ask user to enter an integer number
    // We will find out if this is an even number or not
    // Input is 7
    // Output 7 is even number false
    // input is 8
    // Output 8 is even number true
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer number");
//        int number = scanner.nextInt();
//        // If remainder with 2 gives 0 this number will be even
//        // other wise it is odd
//
//        boolean isEven = number%2 == 0;
//        System.out.println(number+" is even number "+isEven);
//
//        // Ask user to enter two integer number
//        // First integer you provide should be bigger than
//        // second one.
//        // If first number bigger than the second one
//        // we will print out      true
//        // if second number bigger than the first number
//        // we will print out false.
//
//       System.out.println("enter your first integer number");
//   int firstNumber = scanner.nextInt();
//
//
//
//        System.out.println
//                ("please enter an integer but smaller than first one");
//        int secondNumber = scanner.nextInt();
//
//        boolean isFirstBigger = firstNumber>secondNumber;
//        System.out.println(isFirstBigger);

// To be able to graduate from school
        // student needs
        // %85 attendancy
        // 80 or higher grade
        // %70 of homework
        // create a program for teacher
        // teacher will enter all these variables and
        // if student passes you will print true for teacher
        //if student fails you will print false for teacher

        System.out.println("Please enter attendancy for student");
        int attendancy = scanner.nextInt();

        System.out.println("Please enter grade for student");
        int grade = scanner.nextInt();

        System.out.println("Please enter homework for student");
        int homework = scanner.nextInt();
// How can i print for all of them
       boolean isGrade =  grade>=80;
       boolean isAttendancy =attendancy>=85;
       boolean isHomework =homework>=70;
        System.out.println("Grade is "+ isGrade);
        System.out.println("Attendancy is "+ isAttendancy);
        System.out.println("Homework is "+ isHomework);


        boolean isPass = isAttendancy&&isGrade && isHomework;

        System.out.println(isPass);






    }


}
