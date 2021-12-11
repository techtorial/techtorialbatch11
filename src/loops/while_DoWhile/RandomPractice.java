package loops.while_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] args) {

        Random random = new Random();


        int number = random.nextInt(100);
        System.out.println(number);

        int number2 = random.nextInt(2);
        System.out.println(number2);
    }
}
