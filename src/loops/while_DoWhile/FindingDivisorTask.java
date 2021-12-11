package loops.while_DoWhile;

import java.util.Scanner;

public class FindingDivisorTask {
    public static void main(String[] args) {
        //Ask user to enter an integer value and find the divisors of the given number

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive whole number");
        int inputNumber = scanner.nextInt();

        int divisor = 1;

        while ( divisor <= inputNumber ) {

            if (inputNumber % divisor == 0){

                System.out.println(divisor+ " is divisor of "+ inputNumber);

            }
             divisor++;
        }

    }
}
