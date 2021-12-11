package loops.forLoop;

public class Practice2 {


    public static void main(String[] args) {

        // print out numbers between  0 to 5 decreasing by using for loop
        // 5, 4, 3 ... 0

        for ( int number = 5  ;  number >=0   ; number-- ){

            System.out.println(number);

        }

        // find the total of numbers from 1 to 5 by using for loop
        // 1 + 2 + 3 + 4 = 10
        int sum = 0;
        for ( int i = 1 ; i<5  ; i++ ){

                sum += i;

            System.out.println("Total >> "+sum);
        }
        System.out.println("Final Total >> "+sum);





    }
}
