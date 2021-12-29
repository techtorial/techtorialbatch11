package object;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodPractice {
    /*
        `create a method that will calculate age of a person,
        `does not return age,
        `will take birth year as parameter,
        `user provides the birth year
        `will print age of person
     */

    public void ageCalculator(int birthYear) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your birth year");
//
//        birthYear = scanner.nextInt();

        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println("your age is: " + age);
    }
    //=================================================================
    // overload ageCalculator method by passing name of the person as parameter and
    //return age

    public int ageCalculator(int birthYear, String name) {

        int age = LocalDateTime.now().getYear() - birthYear;
        System.out.println(name+" your age is: " + age);
        System.out.println("OverLoaded age calculator method");
        return age;
    }



    //=================================================================
    // create a method that will take int array as a parameter
    // it will calculate sum of the numbers in this array
    // it will return the sum as double

    //{1,2,3,4,5}
    public double sumOfArrayElements(int[] ids) {

        double sum = 0;

        for (int id : ids) {
            sum += id;
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodPractice object2 = new MethodPractice();
        object2.ageCalculator(2013);

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        double v = object2.sumOfArrayElements(nums);
        System.out.println(v);
        System.out.println(object2.sumOfArrayElements(nums));

        double w = object2.sumOfArrayElements(new int[] {1,2,3,4});
        System.out.println(w);

    }

}
