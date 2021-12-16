package MentoringWithAhmet.InterviewQuestionWithDebugging;

import java.util.Scanner;

public class FindTheMultiplicationOfNumber {
//Write a program that will accept numbers like 578432
    //get the multiplication of the number 5*7*8*4*3*2 -->6720

    // get the sum of the number 5+7+8+4+3+2 -->29
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();

        // HOW AM I GOING TO REACH OUT EACH ELEMENT FROM THE INT ?
        // I SHOULD USE THE MODULES(REMAINDER) 10;
        int SumOfmultiplication = 1;
        while(number!=0){
            int digit = number%10;
            number=number/10;//number/=10;
            SumOfmultiplication=digit*SumOfmultiplication;
        }
        System.out.println(SumOfmultiplication);
        // 123 -- > %10  --- > 3
        // 123\10 > 12 --> %10 ->2
        // 12\10> 1 -->%10 -->1
        //1\10 > 0


    }
}
