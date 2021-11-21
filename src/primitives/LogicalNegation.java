package primitives;

public class LogicalNegation {

    public static void main(String[] args){

        boolean isLightOn = true;

        System.out.println(isLightOn);

        System.out.println(!isLightOn);

        System.out.println(5 == 5); //true

        System.out.println(!(5 == 5));

        System.out.println(1+1 == 3);

        boolean haveMoney = false;

        haveMoney  = !haveMoney;

        System.out.println(haveMoney);
        System.out.println(!haveMoney);


        System.out.println(">>>>>"+isLightOn);

        System.out.println("******"+haveMoney);
        System.out.println(isLightOn == haveMoney);
        System.out.println(!(isLightOn == haveMoney));

    }
}
