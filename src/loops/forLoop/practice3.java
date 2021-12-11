package loops.forLoop;

public class practice3 {

    public static void main(String[] args) {
        // print out every letter from the string
        // print index number of the letter and * together with the letter >> 0*T 1*o 2*d ....

        String str = "Today is Snowy";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        for (int i = 0; i < str.length(); i++) {

            System.out.print(i + "*" + str.charAt(i) + " ");
        }
        // print out only letter 'y' from the string

        System.out.println();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'y') {
                System.out.println(i + "" + str.charAt(i));
            }

        }
        // count the number of letter 'n' in the given String
        // "There are ... 'n' in the string"
        //
        int count = 0;
        for (int i = 0 ; i < str.length(); i++) {

            if (str.charAt(i) == 'n') {
                count++;
                //System.out.println(count);
            }
         //  System.out.println(count);
        }
        System.out.println("There are "+count + " letter n in the string");

    }
}
