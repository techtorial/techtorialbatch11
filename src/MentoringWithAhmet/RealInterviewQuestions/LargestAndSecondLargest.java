package MentoringWithAhmet.RealInterviewQuestions;

import java.util.Arrays;

public class LargestAndSecondLargest {

    //Write a java program that Find the largest and second largest with the sort method from the array.
    public static void main(String[] args) {
        int[] array = {100,300,200,450,350};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[array.length-2]);
//        System.out.println(array[array.length-1]);
        int largest=array[0];
        int secondLargest=0;
        for(int i =0 ;i<array.length;i++){
            if(array[i]>largest ){
                secondLargest=largest;
                largest=array[i];

            }else if(array[i]>secondLargest &&array[i]!=largest){
                secondLargest=array[i];
            }
        }
        System.out.println("The largest number =" + largest + "and second Largest= " + secondLargest);
    }

    // Interview Question:

    //output:
    //The largest number =450 and secondLargest =350

}
