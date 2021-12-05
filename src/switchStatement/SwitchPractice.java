package switchStatement;

public class SwitchPractice {

    public static void main(String[] args) {

        System.out.println("Before Switch");
        int number = 130;

        switch (number) {
//            default:
//                System.out.println("This is default case");
//                break;
            case 123:
                System.out.println("this is fourth case");
                break;
            case 110:
                System.out.println("This is second case");
                break;
            case 120:
                System.out.println("This is third case");
                break;
            case 130:
                System.out.println("This is fifth case");
                break;
            case 100:
                System.out.println("this is first case");
                break;

        }
        System.out.println("After switch");


    }
}
