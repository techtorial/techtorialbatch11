package set;

import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
        TreeSet<Integer> zipCodes = new TreeSet<>();

        zipCodes.add(44);
        zipCodes.add(11);
        zipCodes.add(22);
        zipCodes.add(55);

        // first()
        System.out.println(zipCodes.first());

        // last()
        System.out.println(zipCodes.last());

        // pollFirst()
        System.out.println(zipCodes.pollFirst());
        System.out.println(zipCodes);

        zipCodes.add(77);

        Integer i = zipCodes.pollLast();

        // pollLast()

        zipCodes.pollLast();
        System.out.println(zipCodes);

        // descendingSet()

        System.out.println(zipCodes.descendingSet());


    }

}
