package array;

public class Task4 {
    public static void main(String[] args) {
        String str = "Sayora";

        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55,  str.length()};

        // find the sum of numbers which are less than 10 from given array
        int total = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 10) {

                total = total + arr[i];
            }

        }
        System.out.println(total);
    }
}
