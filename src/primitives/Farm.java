package primitives;

public class Farm {

    public static void main(String[] args) {

        /*
        in a farm, there are 12 cows and 23 chickens
        1- find the total legs of the animals in the farm and print out
        2- if each cow costs $ 2345 and each chicken costs $23.99
            find the total worth of these animals and print out
         */
        int chicken = 23;
        int cow = 12;
        int numberOfCowLeg = 4;

        int totalLeg = (chicken * 2) + (cow * numberOfCowLeg);
        System.out.println("total number of the legs in the farm is " + totalLeg);

        double cow$ = 2345;
        double chicken$ = 29.99;
        double total$ = cow * cow$ + chicken * chicken$;
        System.out.println("The total worth of the animals is= " + total$);
        System.out.println(cow * cow$ + chicken * chicken$);




    }
}
