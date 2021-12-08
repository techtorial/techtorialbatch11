package loops;

public class PrintAgeTask {
    public static void main(String[] args) {
        /*
         'My age is 21'
         'My age is 22'
         ...
         '			26'
         */
        int age = 21;
        while (age <= 26) {
            //  age++;
            System.out.println("My age is: " + age);
            age++;

            //  ++age;
            System.out.println(age);
//            age +=1;
//            age = age  + 1;
        }
        // print out numbers between 10 to 20 inclusive

        int num = 10;

        while (num < 21) {

            System.out.print(num+" - ");
            num++;
        }


    }
}
