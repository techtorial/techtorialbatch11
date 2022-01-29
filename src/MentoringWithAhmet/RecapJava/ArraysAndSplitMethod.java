package MentoringWithAhmet.RecapJava;

import java.util.Arrays;

public class ArraysAndSplitMethod {
    //POSSIBLE INTERVIEW QUESTION:
    // Some technical questions have array with the loops
    //some of the technical questions have array with the split method.
    /*
    ARRAY:
    *1)Array is a storage for PRIMITIVE AND OBJECTS.
   ** 2)Array is a fixed size.
    3)Array has multidimensional form
    4)Array has a length to get the size
    *5)Array's elements cannot be manipulated.(there is no methods)
    6)int[] array = new int[5];
    int[] array1 = {1,2,3,5,6};

     */
    public static void main(String[] args) {
        String name = "Hello Java is so cool";
        //TASK:
        //I want you reverse each of the words
        //output:
        // olleH
        //avaJ
        //si
        //os
        //looc
        /*
        MY STARTING POINT IS READING THE TASK AND UNDERSTAND THE EXPECTATIONS:
         */
       String[]words= name.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = 0;i<words.length;i++){
            String reverse = "";
            for(int k = words[i].length()-1;k>=0;k--){
                reverse+=words[i].charAt(k);
            }
            System.out.print(reverse+ ",");

        }
        //sum of the numbers;

            String numbers= "123456";
            int sum =0;
            String[] numberArray = numbers.split("");
            System.out.println(Arrays.toString(numberArray));
            for(int i = 0 ; i<numberArray.length;i++){
                sum+=Integer.parseInt(numberArray[i]);

            }
            String result =String.valueOf(sum);
            System.out.println(result);
            //System.out.println(result-22);
            System.out.println(sum-22);

        }


    }

