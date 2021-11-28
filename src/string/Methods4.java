package string;

public class Methods4 {
    public static void main(String[] args) {

        String text ="Selenium";

        // contains(); it will if the string has given value or not, returns true/false

        boolean result1 = text.contains("le");
        System.out.println(result1);
        System.out.println(text.contains("t")); // false
        System.out.println(text.contains("selenium")); // false
        System.out.println(text.contains("1"));
        System.out.println(text.contains("lev"));//
        System.out.println(text.contains("nium")); // true

        // equals(); it will check if the given string has exactly same order of char. will return true/false

        System.out.println(text.equals("Selenium")); //true
        System.out.println(text.equals("nium")); // false
        System.out.println(text.equals("selenium")); // false

        //equalsIgnoreCase()

        System.out.println(text.equalsIgnoreCase("SELeniuM")); // true

        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2));// false   Selenium ---> Java
        String text3 = "SELENIUM";
        boolean result2 =text3.equalsIgnoreCase(text);
        System.out.println(result2);

        text3.concat(text);
        text3.toLowerCase();

        text = text3;
        System.out.println(text3.equals(text));


    }
}
