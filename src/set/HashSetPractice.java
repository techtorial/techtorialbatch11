package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet ids = new HashSet();
        HashSet<Integer> ids1 = new HashSet();
        Set<Integer> ids2 = new HashSet();

        ids1.add(22);
        ids1.add(33);
        ids1.add(44);
        ids1.add(99);

        System.out.println(ids1);

        System.out.println(ids1.equals("22"));
        System.out.println(ids1.contains(22));
        System.out.println(ids1.hashCode());

        ids1.add(null);
        System.out.println(ids1);
        ids1.add(null);
        ids1.add(22);
        System.out.println(ids1);

        // get() there is no get method

        for (Integer id : ids1) {
            if (id == null) {
                continue;
            }
            System.out.println(id * 2);
        }
        System.out.println("==============");

        Iterator iterator = ids1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(ids1.size());




    }


}
