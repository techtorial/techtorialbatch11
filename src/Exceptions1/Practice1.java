package Exceptions1;

import java.util.Arrays;

public class Practice1 {

    public static void convertString() {

        System.out.println("This is before try and catch");


        try {


            int x = 1 + 2;
            System.out.println(x);
            String str = "34a";

            int numberStr = Integer.parseInt(str);

            int sum = numberStr + 25;

            System.out.println(numberStr);
            System.out.println(sum);


        } catch (NumberFormatException e) {

            System.out.println("Your conversion from String is not correct --> " + e);
//            System.out.println(Arrays.toString(e.getStackTrace()));
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
        }
        try{
            int a = 5 / 0;
            System.out.println(a); // undefined
        }catch (ArithmeticException exception){

            System.out.println("dividing number by 0 is not possible");
        }


        System.out.println("This is coming after conversion implementation");

    }

    public static void main(String[] args) {
        convertString();
    }


}
