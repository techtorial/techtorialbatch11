package ifStatement;

public class ElseIfPractice {
    public static void main(String[] args) {
        //pick a number btwn 0-15
        //    for each range of 0-5, 6-10, ... >> your number is in the range of 0 to 5 etc.

        int a = 23;

        if (a >= 0 && a <=5 ){
            System.out.println("your number is in range of 0 - 5");
        }else if(a >=6 && a <= 10){
            System.out.println("your number is in range of 6 - 10");
        }else if( a >=11 && a <=15){
            System.out.println(" your number is in range of 11 - 15");
        }else {
            System.out.println("your number is out of range");
        }

    }
}
