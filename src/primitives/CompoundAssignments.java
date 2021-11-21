package primitives;

public class CompoundAssignments {

    public static void main(String[] args) {

        // +=   -=   *=    /=    %=

        int num1= 7;
        int num2 = num1 + 7; // 14
        num1 += num2;
        System.out.println(num1); //21

        num2 -= 8; // num2 = num2 - 8;

        System.out.println(num2); //6
        int num3 = num1 + num2;

        num2 += num3;
        num1 +=num3;

        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);

        // *=
        num1 = 4;
        num1 *=5;
        System.out.println(num1); // num1 = 20

        // /=

        num1 /=4;
        System.out.println(num1); // num1 =5

        // %=

        num1 %= 2;  // num1 = num1 % 2 ==> 5 % 2 ==> remainder is 1
        System.out.println(num1);

        boolean bl1 = true;

       // bl1 +=false;

        char ch1  =  'a';
        char ch2  =  'm';
        char ch3  =  't';

        ch3 += 'a';
        System.out.println("This is ch3 >> " + ch3);

        ch2 *= '3';
        System.out.println(ch2);

        ch1 -= 9;
        System.out.println(ch1);

        int remainder = ch1 % 3;

        System.out.println(remainder);

        ch1 %=2;
        System.out.println(ch1);


    }

}
