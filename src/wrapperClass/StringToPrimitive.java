package wrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str = "12";

        System.out.println(str + 10);// 1210

        int number = Integer.parseInt(str); // Unboxing
        System.out.println(number + 10); // 22
        Integer number1 = Integer.parseInt(str);

        System.out.println(number1.equals("12"));
        System.out.println(number == 12);

        // "128"

        byte by = Byte.parseByte("121");
        System.out.println(by);

     //  int number2 = Integer.parseInt("128GB");// NumberFormatException

       // "true"
        boolean bl = Boolean.parseBoolean("True");
        System.out.println(bl);
        boolean bl1 = Boolean.parseBoolean("TRUe");
        System.out.println(bl1);
        boolean bl2 = Boolean.parseBoolean(" true");
        System.out.println(bl2);
        boolean bl3 = Boolean.parseBoolean(" example");
        System.out.println(bl3);
        boolean bl4 = Boolean.parseBoolean("false");
        System.out.println(bl4);

        float fl = Float.parseFloat("1.2");
        System.out.println(fl);
        float fl1 = Float.parseFloat("2.3f");
        System.out.println(fl1);

        long lg = Long.parseLong("345345623673567365");
        System.out.println(lg);

        double db = Double.parseDouble("4.5d");
        System.out.println(db);
        double db1 = Float.parseFloat("9.5f");
        System.out.println(db1);
//        Integer nm=Integer.parseInt("12.34");
//        System.out.println(nm);

    }
}
