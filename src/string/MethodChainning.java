package string;

public class MethodChainning {
    public static void main(String[] args) {
        String name = "                                 David  ";

       char letter =  name.substring(5).substring(2).toUpperCase().replace("A","xxxx").trim().charAt(1);

        System.out.println(letter);

        name = name.substring(5).substring(2).toUpperCase().replace("A","xxxx").trim();

        System.out.println(name);

        String n = name.substring(5).substring(2).toUpperCase()
                .replace("a","xxxx").trim();
        System.out.println(n);

        int x =5;

    }
}
