package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquePractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Zack");
        names.add("Zack");
        names.add("David");
        names.add("David");
        names.add("Jack");
        names.add("Jessi");

        HashSet<String> hashSet = new HashSet<>();
        // first idea
        hashSet.addAll(names);
        System.out.println(hashSet);
        // second idea
        HashSet<String> hashSet1 = new HashSet<>();
        for (String name : names) {
            hashSet1.add(name);

        }
        System.out.println(hashSet1);

        //third idea use iterator

        // fourth idea -> use constructor of set, pass the source collection into the constructor of set
        HashSet<String> hashSet2 = new HashSet<>(names);
        System.out.println(hashSet2);
        System.out.println(names);


        //=======
        HashSet items = new HashSet();
        items.add("microphone");
        items.add("cable");
        items.add("computer");

        List listOfItems = new ArrayList(items);

        System.out.println(listOfItems);




    }

}
