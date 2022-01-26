package MentoringWithAhmet.RecapJava;

public class StringAndMethods {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)MOST of the technical questions are related with the String
    and it's methods.
    STRING:is an object
    METHODS:
    **1)length():it returns int and it calculates the size of the word.
   * 2)equals():it returns boolean(true or false). it compares the two
    values to each other.
    3)indexof():it returns int. it gets the position of the character.
   ** 4)charAt():it returns character.it takes the index(position) of the
    character.
   * 5)substring(): it returns string.It gets specific parts of the
    String.(you want)
    6)concat():it returns string. It adds the strings.
    7)Upper and LowerCase:It returns string. It converts the letters
    either upper or lower case.
    **8)Split();It returns array of String. It seperate the given words.
    *9)replace():it returns String.it replaces the old char with the
     new one.
    *10)equalIgnoreCase():it returns boolean.it compares the two string
    but ignore the case.(upper or lover)
    11)StartsWith() and endsWith()-->they return boolean and it checks
    the string starts with  or EndsWith the condition
    *12)contains(): it returns boolean. it checks the string whether
    it has the specific character,words..etc.
    *13)trim():it returns the string.it removes the space front and back.
    **14)ValueOf():it returns String from different data type.
    it gets the data(int, double, character,..etc)
     */
    public static void main(String[] args) {
        String example = "    Ahmet loves Java like you guys    ";
       int size= example.length();
        System.out.println(size);
        String example2=" AhmEt loveS Java like you guys ";
        boolean result=example2.equals(example);
        System.out.println(result);
        String s1=new String("hi there");
        int post = s1.indexOf("e");//5
        System.out.println(post);
        char letter=s1.charAt(2);
        String s5 = s1.substring(0,post);
        System.out.println(s5);//hi th
        System.out.println(letter);
        String s3="baby";
        String s4=s3.substring(2);//by
        System.out.println(s4);
        System.out.println(s3+s4+s5);
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(example.replace('a','*'));
        System.out.println(example.equalsIgnoreCase(example2));
        System.out.println(example.startsWith("A"));
        System.out.println(example.endsWith("S"));
        System.out.println(s3.contains("b"));

        System.out.println(example);
        System.out.println(example.trim());


    }
}
