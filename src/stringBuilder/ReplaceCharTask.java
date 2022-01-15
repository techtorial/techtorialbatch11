package stringBuilder;

import java.util.Arrays;

public class ReplaceCharTask {

    /*
    create a method that will take StringBuilder Array as parameter
    this method will replace middle char of each element with '*' from the
    array if the length of the element is odd number
     */
    public static void main(String[] args) {
        StringBuilder[] things = new StringBuilder[7];
        things[0] = new StringBuilder("coke");
        things[1] = new StringBuilder("civic");
        things[2] = new StringBuilder("day");
        System.out.println(Arrays.toString(things));

        StringBuilder[] things1 = {new StringBuilder("xyz"), new StringBuilder("abc"), new StringBuilder("java")};
        builderReplace(things1);
    }
    public static void builderReplace(StringBuilder[] bld){
        for (int i=0; i< bld.length;i++){

            if (bld[i].length()%2 != 0 ){

                bld[i].replace(bld[i].length()/2,(bld[i].length()/2)+1,"*");
            }
            System.out.println(bld[i]);
        }
        System.out.println(Arrays.toString(bld));
    }



}
