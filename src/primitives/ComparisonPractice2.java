package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {

        // there is an event for kids if a child's height is 48" or more they can attend this event
        // print out he result if kid can attend or not

        double reqHeight = 48;
        double kidHeight = 48;

        boolean canAttend = kidHeight >= reqHeight;
        System.out.println("Can this child attend the event? "+canAttend);

        //if the age of child is 6 or less it will free

        int reqAge = 6;
        int kidAge = 7;

        boolean isFree = kidAge <= reqAge;
        System.out.println("Is the event free for child? "+isFree);
    }
}
