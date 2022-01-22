package Mentoring;

import java.util.Arrays;
import java.util.Collection;

public class BinarySearch {

    // Create a method that takes an int array and int keyNumber (10)
    // find the key number in array by implementing binary search.
    // What is binary search?
    // 1,2,5,6,7,8,9,10
//    he array elements must be sorted for implementing binary search.
//    The binary search algorithm is based on the following conditions.
//    If the key is less than the middle element, then we now need to search only
//    in the first half of the array.
//    If the key is greater than the middle element, then we need to only search in the
//    second half of the array.
//            And if the key is equal to the middle element in the array, then the search
//    ends.
//    Finally, if the key is not found in the whole array, then it should return -1.
//    This indicates that the element is not present.
public static int binarySearch(int array[],int keyNumber){
    // first we need to find middle index in array.
    Arrays.sort(array);
    int middle = (array.length-1)/2;
    int highest = array.length-1;
    int lowest = 0;
   for ( ;lowest<=highest;  ){
       if(array[middle]>keyNumber){
           highest =middle-1;

       }else if(array[middle]<keyNumber){
           lowest=middle+1;
       }else {
           return middle;
           // The middle is the index of the number we are looking for.
       }

       middle = (lowest+highest)/2;

   }
    return -1;





}

    public static void main(String[] args) {
        int [] arr = new int[] {1,2,5,6,7,8,9,10};

        System.out.println(  binarySearch(arr,3));













    }

}
