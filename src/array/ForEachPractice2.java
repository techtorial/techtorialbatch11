package array;

public class ForEachPractice2 {
    public static void main(String[] args) {
        char[] chs = {'A', '4', '&','z','3','u', '*'};

        // by using for each loop, print out letters only

        for ( char symbol : chs){

            if (symbol >='A' && symbol<='Z' || symbol >='a' && symbol <='z'){
                System.out.println(symbol);
            }
        }
    ///=================================================

        for (char letter: chs){

            if (Character.isAlphabetic(letter)){
                System.out.println(letter);
            } else if (Character.isDigit(letter)) {
                System.out.println("This is a digit "+letter);
            }else {
                System.out.println("This is some symbol "+letter);
            }
            }

        }



}
