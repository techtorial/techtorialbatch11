package MentoringWithAhmet.RecapJava.OOP;

public class Exceptions {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1)How do you handle the exceptions?
    I can handle the exceptions with try and catch blocks
    2)Can you use more than one catch block
    Yes you can use more than one catch block
    3)What do you know about final, finally, finalize ?
    Final: is a keyword to make the variable or method unchangeable.
    Finally: is a block that comes after try and catch to show final execution(statement)
    Finalize(): is a method which works with GC to make sure it is manually worked.(System.gc)
    4)Throw and Throws?



     */
    public static void main(String[] args) {
        System.out.println("Today is the last day of Java");
        try{
            String number="35c";
            int realnumbers= Integer.parseInt(number);
        }catch(IllegalArgumentException exception){
            System.out.println("there is an illegal exception");
        }catch (IndexOutOfBoundsException exception){
            System.out.println("there is indexoutofBOund exception");
        }finally{
            System.out.println("finally block");
        }
       String numbers="35c";
        int sum = 0;
        for(int i=0; i<numbers.length()+2;i++){
            sum+=numbers.charAt(i);
        }
        System.out.println(sum);
    }
}
