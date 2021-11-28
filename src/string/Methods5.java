package string;

public class Methods5 {
    public static void main(String[] args) {

        String word = "Sunday";

        // replace()

        String updatedWord = word.replace('a','$');

        System.out.println(updatedWord);

        String updatedWord1 = word.replace("Sun","Satur");
        System.out.println(updatedWord1);
        System.out.println(word.replace("day","*"));

        System.out.println(word.replace("sun","Satur"));

        String code = "java";

        System.out.println(code.replace('a','%'));

    }
}
