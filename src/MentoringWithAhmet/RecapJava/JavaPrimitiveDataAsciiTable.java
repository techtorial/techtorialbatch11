package MentoringWithAhmet.RecapJava;

public class JavaPrimitiveDataAsciiTable {
    /*
    What is Java --> Java is a programming language which helps people to communicate
    with the computer(program).(BRIDGE BETWEEN HUMAN AND COMPUTER)
    Possible Interview Questions:
    1)What is JDK, JVM, and JRE?
    2)What do you know about JDK, JVM and JRE(American Style)
    3) There is no possible directly asking questions about PRIMITIVE but most of the
    technical questions require Primitive DATA

    JDK:JAVA DEVELOPMENT KID--> is a sofware development kit required to develop application
    in java with specific libraries.
    JRE:JAVA RUN TIME ENVIRONMENT-->is a set of software tools responsible for EXECUTION.
    JVM: JAVA VIRTUAL MACHINE:is responsible for CONVERTING BYTE CODE TO BINARY CODE
    to the machine.

    PRIMITIVE DATA: is a way to store data and reuse it.

    WHOLE  NUMBERS:
    int -->
    byte
    long
    short

    DECIMAL NUMBER:
    double
    float

    CONDITION
    Boolean; TRUE OR FALSE

    ChARACTER:
    Char--> ASCII TABLE

    ASCII TABLE:
    is the table that contains all of the characters(numbers, symbols,letter etc..)

    short a = 5;
    short b= 6;
    short c=a+b;
    sout(c);

     */
    public static void main(String[] args) {
        short a = 5;
        short b= 6;
        short c=(short)(a+b);//this is going to give you compile time error because whenever
        //do any work with below int. It will automatically converts to the int
        char letter=65;//ascii table something
        char letter2='g'; // g
        System.out.println(c);
       double numbers=5.643534534534;//shouldn't should
        float numbers2= 12.543534f;//should
        System.out.println(letter);
        System.out.println(letter2);


    }
}
