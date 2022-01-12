package map;

import java.util.HashMap;

public class CountAndStore {

    public static void main(String[] args) {

        String[] drinks = {"coke", "water", "coke", "coffee", "ayran",
                "water","ayran","ayran","ayran","ayran","ayran"};


        HashMap<String, Integer> map = new HashMap();


        for (String drink : drinks) {

            if (!map.containsKey(drink)) {

                map.put(drink, 1);

            }else{

                map.put(drink, map.get(drink) +1);
            }

        }
        System.out.println(map);


    }
}
