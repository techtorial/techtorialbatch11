package array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args){

        int[] zipCodes = {61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipCodes));// [61212, 91213, 11214, 71215]

        Arrays.sort(zipCodes); // it will arrange data in ascending(from smaller to larger) order
        System.out.println(Arrays.toString(zipCodes));


        String[] colors = {"violeT", "pink","Red", "white", "black","red", "brown","red"};

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));





    }
}
