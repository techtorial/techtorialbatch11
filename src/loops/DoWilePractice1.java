package loops;

public class DoWilePractice1 {

    public static void main(String[] args) {

        // find and show sum of the numbers between 10 to 20 by using do-while loop

        int a =10;
        int b = 20;
        int sum = 0;

        do {

            sum +=a;
            a++;

        }while ( a <= b );
        System.out.println("sum is: "+sum);
    }
}
