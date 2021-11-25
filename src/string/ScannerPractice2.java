package string;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        // BMI calculation BMI = weight(kg) / (height * height(meter (ex: 1.8)))
        // 18 - 24
        // "your BMI is <BMI>"

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your weight in kg ");

        double weight = scanner.nextDouble();
        System.out.println("please enter your height in meters (i.e: 1.8)");

        double height = scanner.nextDouble();

        double BMI = weight / (height *height);
        System.out.println("Your BMI is "+ BMI);

    }
}
