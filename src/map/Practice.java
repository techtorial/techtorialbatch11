package map;

import java.util.HashMap;

public class Practice {

    public static void main(String[] args) {

        HashMap <Integer, String> map  = new HashMap();

        // put()
        map.put(1,"Enes");
        map.put(2,"Alex");
        map.put(3,"David");
        map.put(4,"Alex");

        System.out.println(map);

        map.put(1,"Yusuf"); // if you try to store same key multiple times,
                            // it will update the value for it

        System.out.println(map);

        map.put(6,"Enes");
        System.out.println(map);
        map.put(null,"David");
        System.out.println(map);

        // get()

        System.out.println(   map.get(2)); // it will get the value for key 2

        System.out.println(map.get(3));
        System.out.println(map.get(null));

        // remove()
        map.remove(null);
        System.out.println(map);

        System.out.println(map.remove(1,"Yusuf"));
        System.out.println(map);
        // replace();
        map.replace(2,"Jennifer");
        System.out.println(map);

        map.replace(2,"Jennifer","Zack");
        System.out.println(map);

        System.out.println(map.containsKey("Zack"));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsKey(19));

        System.out.println(map.containsValue("Enes"));
        System.out.println(map.containsValue(false));

        // size()
        System.out.println(map.size());

        System.out.println(map.isEmpty());

        // putAll()

        HashMap <Integer, String> map1 = new HashMap<>();

        map1.put(1,"White");
        System.out.println(map1);
        map1.putAll(map);
        System.out.println(map1);
        map1.put(9,"Brian");
        System.out.println(map1);





    }

}
