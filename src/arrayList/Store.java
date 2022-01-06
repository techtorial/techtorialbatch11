package arrayList;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        // store 5 computer objects into an ArrayList

        Computer computer1 = new Computer("Mac",1600,13.3,"White",256);
        Computer computer2 = new Computer("Hp",1100,16,"Silver",256);
        Computer computer3 = new Computer("Dell",1100,16,"Silver",256);
        Computer computer4 = new Computer("Lenovo",1100,16,"Silver",256);
        Computer computer5 = new Computer("Mac",2000,17,"Red",256);


        ArrayList<Computer> list = new ArrayList<>();
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);

        System.out.println(list);
   // reach out all mac computers and show them

        for ( Computer device: list){

            if (device.brand.equalsIgnoreCase("mac")){
                System.out.println(device);
                System.out.println(device.brand);
                System.out.println(device.price);
            }
        }

    }
}
