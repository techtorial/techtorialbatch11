package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();

        names.add("Dima");
        names.add("Diana");
        names.add("Aizat");
        names.add("Samir");

        System.out.println(names);

        // convert this arrayList to Array

        Object[] arrayNames = names.toArray();

        System.out.println(Arrays.toString(arrayNames));

//        arrayNames[arrayNames.length] = "Alex";
//        System.out.println(Arrays.toString(arrayNames));


        ArrayList <Flower> flowers = new ArrayList<>();
        Flower flower1 = new Flower(12,"red","rose");
        Flower flower2 = new Flower(11,"yellow","tulip");
        Flower flower3 = new Flower(10,"green","pepper");

        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);

        Object[] arrayFlowers = flowers.toArray();

        System.out.println(Arrays.toString(arrayFlowers));
        for (Object o: arrayFlowers){

            System.out.println(o);

        }

    }
}
