package primitives;

public class CharPractice {

    public static void main(String[] args){

        char ch1 = 'A';

        System.out.println(ch1);

        System.out.println("A");

        System.out.println('A');

        ch1= '5';   // re-assignment --> from ASCII table '5' is decimal of 53
        System.out.println(ch1);

        System.out.println(ch1*2);
        char ch2 = ch1;
        System.out.println(ch2);

        char ch3 = '&';
        System.out.println(ch3);

        char ch4 = 80; // P
        System.out.println(ch4); // P
       // char ch5 = 'ye'; you can not assign more than one character in single quotation mark

        int numberChar = 'T';
        System.out.println(numberChar);

         char randomChar = 2345;

        System.out.println(randomChar);

        int v = 'ऩ';
        System.out.println(v);

    }
}
