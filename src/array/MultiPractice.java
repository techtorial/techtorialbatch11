package array;

import java.util.Arrays;

public class MultiPractice {
    public static void main(String[] args) {

        int[][] numbers = new int[2][3];

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);

        numbers[0][0] = 22;
        numbers[0][1] = 33;
        numbers[0][2] = 44;
        numbers[1][0] = 55;
        numbers[1][1] = 66;
        numbers[1][2] = 77;

        System.out.println(numbers[1][1]); // 66

   //    numbers[0][3] = 88; // ArrayIndexOutOfBoundsException
    //    System.out.println(numbers[0][3]); // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.deepToString(numbers)); // [[22, 33, 44], [55, 66, 77]]

        for (int i=0; i < numbers.length; i++){
        //    System.out.println(Arrays.toString(numbers[i])); // this will print inner arrays as array
            for (int k = 0; k< numbers[i].length; k++){

                System.out.println(numbers[i][k]); // this is printing elements one by one

            }
        }
        System.out.println("==========================");
        //[[22, 33, 44], [55, 66, 77]]

        for (  int[] nums : numbers  ){

            for (int num : nums ){
                System.out.println(num);
            }
        }

    }
}
