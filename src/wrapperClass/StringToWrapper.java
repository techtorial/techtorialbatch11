package wrapperClass;

public class StringToWrapper {

    public static void main(String[] args) {


        String color = "20";

        Integer number = Integer.valueOf(color);
        System.out.println(number + 30); //

        Boolean bl = Boolean.valueOf("TRUE");
        System.out.println(bl);
        Boolean bl1 = Boolean.valueOf("example");
        System.out.println(bl1);

        int i = Integer.valueOf("77");
        System.out.println(i);

        // Character ch = Character.valueOf("k");//  compile time error


        Integer number8 = null;
        String number9 =""+number8;
        System.out.println(number9);
        int number10 = 0;
        System.out.println(number10);

    }
}
