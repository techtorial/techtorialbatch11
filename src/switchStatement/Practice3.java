package switchStatement;
import java.util.Scanner;
public class Practice3 {

    /*
    ask user for name of geometrical shape
    based on the name of the shape
    calculate the AREA of that shape
    get length, width for rectangle
    get height and base for triangle from user to use them in calculations
    print out name of the shape and area of that shape
    -triangle, rectangle
        rectangle = l * w    triangle = (base * height)/2
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which shape you want to calculate area of? Triangle/Rectangle");

        String shape = input.nextLine().toLowerCase();

        switch (shape){
            case "triangle":
                System.out.println("Please enter height of triangle");
                double h = input.nextDouble();
                System.out.println("Please enter base of triangle");
                double b = input.nextDouble();
                System.out.println("The area of triangle is: " +((b * h )/ 2));
                break;
            default:
                System.out.println("your shape selection is not an option for us");
                break;
            case "rectangle":
                System.out.println("Please enter length of rectangle");
                double l = input.nextDouble();
                System.out.println("Please enter width of rectangle");
                double w = input.nextDouble();

                System.out.println("The area of rectangle is: "+ l * w);
                break;

        }
        double d = 2.5;
        short s = 2;
        boolean b =true;
        long l = 2;
        byte by = 3;
        switch (by){
            case 5:
                System.out.println("^^^^^^^^");
        }

    }

}
