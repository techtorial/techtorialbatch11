package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

    public static void main(String[] args) {

        HashSet <String> colorsHash = new HashSet<>();
        LinkedHashSet <String> colorsLinked = new LinkedHashSet<>();
        TreeSet<String> colorsTree = new TreeSet<>();

        colorsHash.add("White");   colorsLinked.add("White");   colorsTree.add("White");
        colorsHash.add("Black");   colorsLinked.add("Black");   colorsTree.add("Black");
        colorsHash.add("Blue");    colorsLinked.add("Blue");    colorsTree.add("Blue");
        colorsHash.add("Purple");  colorsLinked.add("Purple");  colorsTree.add("Purple");
        colorsHash.add("Red");     colorsLinked.add("Red");     colorsTree.add("Red");
        colorsHash.add(null);       colorsLinked.add(null);   //  colorsTree.add(null);

        System.out.println(colorsHash);// no order
        System.out.println(colorsLinked); // insertion order
        System.out.println(colorsTree); // ascending order

        System.out.println(colorsTree.descendingSet());

        Set<String> example = colorsTree.descendingSet();

        System.out.println(example);






    }
}
