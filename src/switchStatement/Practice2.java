package switchStatement;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        /*
        Ask user for his/her favorite fruit
        -you have: mango, banana, kiwi, orange, apple, grape
        if you have user's favorite fruit, --> We have your favorite fruit in our store
        -other wise: Sorry, we don't have your favorite fruit :( :
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite Fruit? please enter name of it");
        String str = input.nextLine().toLowerCase();

        switch (str){
            case "mango":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in the store");
                break;
            default:
                System.out.println("WE do not have your favorite in our store. Sorry!!");
                break;
        }

    }
}
