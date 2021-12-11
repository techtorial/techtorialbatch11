package loops.forLoop;

public class CharPractice {

    public static void main(String[] args) {

       // print out lowercase alphabet

        for ( char ch1 = 'a'  ; ch1 <='z'  ; ch1++ ){

            System.out.print(ch1+ " ");
        }
        System.out.println();
        // print out letters from h to t
        for ( char ch1 = 'h'  ; ch1 <='t'  ; ch1++ ){

            System.out.print(ch1+ " ");
        }
        System.out.println();
        for ( char ch1 = 'z'  ; ch1 >='a'  ; ch1-- ){

            System.out.print(ch1+ " ");
        }

    }
}
