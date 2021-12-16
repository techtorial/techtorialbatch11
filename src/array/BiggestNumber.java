package array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {

        int[] nums = {4, 24, 10, 100, 5, 78, 11, 25, 55};

        // find biggest number from given array
        int biggest = nums[0];
        for (int k = 1; k < nums.length; k++){

            if (nums[k] > biggest){

                biggest = nums[k];
            }
        }
        System.out.println(biggest);// largest number in the array

        System.out.println("=============");

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]); // largest number in the array
        System.out.println(nums[0]); // smallest number in the array
    }
}
