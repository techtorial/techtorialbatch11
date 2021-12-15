package loops.forLoop;

public class PalindromePractice {

    public static void main(String[] args) {
        //civic,  ana

        String str = "Efe";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {


            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            System.out.println(str+ " is a palindrome string");
        } else {
            System.out.println(str+" It is NOT a palindrome string");
        }
        // find out if given number is palindrome number or not

        int number = 1234321;
        String str1 =""+number;
    }
}
