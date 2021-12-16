package array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {

        int[] nums1 = {3,4,5,8,9};
        int[] nums2 = {6,7,8,9};
        // combine these two arrays in to another array

        int[] result = new int[nums1.length+nums2.length];

        for (int a= 0; a<nums1.length; a++){

            result[a] = nums1[a];
        }
        System.out.println(Arrays.toString(result));

        for (int b= nums1.length, c=0; b < result.length; b++, c++){
            result[b] = nums2[c];
        }
        System.out.println(Arrays.toString(result));

    }
}
