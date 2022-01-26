package MentoringWithAhmet.RecapJava;

import OOP.Abstraction.Interfaces.Puffin;

import java.util.Scanner;

public class Loops {
    /*
    Possible Interview Questions:
    1)Many technical questions they require to use loops to solve the
    questions.
    2)Reverse the STRING
    3)Reverse the Number


    LOOPS: is a way to iterate the elements one by one.
           is a  Cycle for the repetitive actions.
     TYPES OF LOOPS:
     *DO WHILE
     * WHILE
     *FOR LOOP
     *FOR EACH

     DO WHILE: WE NEED IT ONCE WE NEED TO RUN THE CODES AT LEAST ONE TIME.


     */
    public static void main(String[] args) {
        int x =6;       //2 and 1
        int y=7;
        do{
            System.out.println("hello");
            y--;
        }while(y<x);
        int input;
//        do{
//            Scanner scan = new Scanner(System.in);
//            System.out.println("1)Continue\n2)Exit");
//             input=scan.nextInt();
//        }while(input!=2);

        //while loop (int number =1234; reverse it and get multiplication);
        //output:4321
        //sum:24;
        int number=1234;
        String reverse="";
        int multiplication=1;
        while(number!=0){//number>0;
            int digit = number%10;//1234 -->4
            multiplication*=digit; //4
            reverse+=digit;
            number/=10; //123 1/10-->0
int array[]={1,2,3,5};
        //FOREACH:
            for(int a:array){
                System.out.println(a);
            }
        }
        System.out.println(multiplication);
        System.out.println(reverse);
        // Can you find the PRIME NUMBER between 1-100;
        //Prime number; it is a number that divisible only for 1 and itself.
        //example 2,3,5,7,11,13,17....
        //We should use flag to make sure it is not dublicating the codes again and again
        int startingPoint=6; //5
        int endingPoint=10000000;
        for(int i = startingPoint;startingPoint<=endingPoint;startingPoint++){ // 14 --> 15 3 5
            boolean isPrime=true;
            for(int k=2;k<startingPoint/2;k++){
                if(startingPoint%k==0){
                    isPrime=false;
                    break;
                }
                }
            if(isPrime&&startingPoint!=1){
                System.out.println(startingPoint+" is a prime number");
            }
        }

    }



}
