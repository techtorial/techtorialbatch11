package string;


import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        System.out.println("Welcome");
        String name = "David";

        System.out.println("My name is "+name);

        // creating  Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        System.out.println(lastName);
        System.out.println(lastName);

        //Task: Ask user to enter his/her city name and
        // print as: "<name><lastName> you are living in <city>"

        System.out.println("Please enter your city name");
        String city = input.nextLine();

        System.out.println(name + " "+ lastName+" you are living in "+city);

        lastName = "XXXXXXX";
        System.out.println(lastName);

        System.out.println("Please enter your age");

        int age = input.nextInt();

        System.out.println(name + " your age is very good age. That is >> "+age);

        System.out.println("Please enter your height in feet and inches(i.e: 5.8)");

        double height = input.nextDouble();

        System.out.println("your height is "+height);

        System.out.println("Please enter your address");

       // input = new Scanner(System.in);
        input.nextLine();
        String address = input.nextLine();

        System.out.println("Is this correct address you provided? "+address);



    }
}
