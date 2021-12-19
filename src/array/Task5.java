package array;

public class Task5 {
    public static void main(String[] args) {
        // find missing number form sequence
        int[] numbers = {4,5,7,8,9};
        int sum1= 0;
        int sum2=0;

        for (int a: numbers){

            sum1 += a;
        }
        for (int i=4; i<= 9; i++){

            sum2 += i;
        }
        System.out.println("Missing number in the array is "+(sum2 - sum1));

    }
}
