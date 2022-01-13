package HashTable;

import java.util.Hashtable;

public class Practice {
    public static void main(String[] args) {

        Hashtable <Integer, String> hashtable = new Hashtable<>();

        hashtable.put(4, "cherry");
        hashtable.put(5, "kiwi");
        hashtable.put(1,"apple");

        System.out.println(hashtable);

        System.out.println(hashtable.get(2)); //
        System.out.println(hashtable.get(1)); //

        System.out.println(hashtable.keySet());
        System.out.println(hashtable.values());
        System.out.println(hashtable.entrySet());

        // adding null key or null value

      //  hashtable.put(null, "orange");
      //   hashtable.put(9, null);

        hashtable.put(3, "strawberry");
        System.out.println(hashtable);

        Hashtable<String, String > hashtable1 = new Hashtable<>();

        hashtable1.put("a", "b");
        hashtable1.put("m", "x");
        hashtable1.put("k", "g");
        hashtable1.put("r", "a");
        System.out.println(hashtable1);









    }
}
