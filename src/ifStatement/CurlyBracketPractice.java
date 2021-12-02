package ifStatement;

public class CurlyBracketPractice {

    public static void main(String[] args) {

        int number = 1234;

        if (number == 1234)
            System.out.println("Number is equals to 1234");
            System.out.println("Number is not equals to 1234");


        if (number == 5)
            System.out.println("Hello World");
            System.out.println("hello JAVA");
            System.out.println("hello Selenium");
            System.out.println("Hello ALex");
            System.out.println("Hell All");

         int num1 = 6;

         if (num1 < 10)
             num1++;
        System.out.println(num1);

        int num2 =4;
        if (num2 > 20)
            num2++;
        System.out.println(num2);

        if (num2> 20){

            num2++;
            int x = number + num2 + 67;
            x = x * 7;
            System.out.println("I am in the Curly ===> "+num2);
        }
        int a =9;
        if ( 1 == 1)
            a = 2 + 2;

        System.out.println("===========");

        System.out.println(a);

        int capacity=20;
        int studentNumber=25;

        if(capacity>studentNumber)
            System.out.println("There is enough space in the classroom");
        studentNumber++;
        System.out.println(studentNumber);

    }
}
