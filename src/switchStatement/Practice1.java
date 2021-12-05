package switchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 from user
        print out name of a season as:
        1 -> Winter
        2 -> Spring
        ...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 4 to select a season " +
                "\n 1- Winter\n 2- Spring \n 3- Summer\n 4- Fall");

        int a = sc.nextInt();
        switch (a) {
            default:
                System.out.println("There is no such season, please enter a valid number for your selection");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;

        }
    }
}
