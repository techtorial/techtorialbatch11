package primitives;

public class UnaryPractice2 {

    public static void main(String[] args) {

        int a = 7;
        int b = 4;

        int result = --a + --b + a++ * 2 - b++ * a--;

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        //==========

        int donutNumber = 12;
        int eachDonut = 2;

        int total = donutNumber * eachDonut;
        System.out.println(total); // DD

        System.out.println(--total); // KK

        char ch = 'a';
        System.out.println(--ch);
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
        System.out.println(ch);
        System.out.println(--ch);


    }
}
