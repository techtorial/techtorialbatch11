package primitives;

public class ArithmeticPractice {

    public static void main(String[] args) {

        // addition --> +
        int num1 = 3;
        int num2 = 4;
        System.out.println(num1 + num2);
        System.out.println("Total is: " + (num1 + num2));

        int sum = num1 + num2;
        System.out.println(sum);

        //subtraction --> -

        int difference;
        difference = 10 - num2;
        System.out.println("difference is = " + difference);

        // multiplication --> *

        double product = difference * num2;
        System.out.println(product);

        // division --> /

        double division = product / 3.0;
        System.out.println(division);

        product = product * division;
        System.out.println(product);

        int division2 = 5 / 2;  // 2+2+1
        System.out.println(division2);

        double division3 = 5 / 2d;
        System.out.println(division3);

        float division4 = 5 / 2f;
        System.out.println(division4);

        float division5 = num2 / num1;

        // remainder  --> left over --> % (Modulus)

        int a = 11;
        int b = 5;

        int remainder1 = a % b;
        System.out.println("The left of 11/5 is = " + remainder1);

        int x = 13;
        int y = 5;

        int remainder2 = x % y;
        System.out.println(remainder2); //3

        System.out.println(25%21); // 4

        System.out.println(25 % x); // 12

        int result = a + b * x - y / a * b + x % 2;


        // casting
    }
}
