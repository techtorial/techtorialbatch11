package string;

public class Concat {

// Data types, reserved keywords, variable name, method name
    // For name of main method it must always be main to be able to run
    public static void main(String[] args) {

        String number = "1";
          int n = 4;

        number += "2";
        number += 2;
        System.out.println(number); // 122 is the outcome

        // String has built methods/functions you can call by using your variable
        String test = "Chicago";

        test = test.concat(" is the best"); // Chicago is the best
        System.out.println(test);
        test = test.concat(" in the summer"); // Chicago is the best in the summer

        System.out.println(test);

        test += test.concat(" EVER");
        System.out.println(test);// Chicago is the best in the summerChicago is the best in the summer EVER




    }
}
