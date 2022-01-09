package set;

import java.util.*;

public class UniquePractice1 {

    public static void main(String[] args) {

        String[] letters = {"a", "b", "c", "d", "d"};

        // store these elements in to a set

        // convert array to list >> List to Set

        List listOfLetters1 = new ArrayList(Arrays.asList(letters));
        listOfLetters1.add("r");

        System.out.println(listOfLetters1);

        List listOfLetters = Arrays.asList(letters);

        //listOfLetters.add("t");

        System.out.println(listOfLetters);
        TreeSet setOfLetters = new TreeSet(listOfLetters);

        setOfLetters.add("x");
        setOfLetters.add("t");
        System.out.println(setOfLetters);

        HashSet set = new HashSet(Arrays.asList(letters));

        String[] letters1 = {"a","a", "b", "c", "d", "d","t","t","a","t"};

        // show/print duplicate elements

        HashSet <String> hashSet = new HashSet<>();

        ArrayList duplicateStorage = new ArrayList();

        for (String letter: letters1){

            if (!hashSet.add(letter)){
                System.out.println("This is repeating element "+letter);
                duplicateStorage.add(letter);
            }

        }
        System.out.println(hashSet);
        System.out.println(duplicateStorage);

    }
}
