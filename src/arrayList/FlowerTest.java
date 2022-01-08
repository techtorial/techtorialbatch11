package arrayList;

import java.util.ArrayList;

public class FlowerTest {

    public static void main(String[] args) {
        Flower flower1 = new Flower(12,"red","rose");
        Flower flower2 = new Flower(11,"yellow","tulip");
        Flower flower3 = new Flower(10,"green","pepper");

        ArrayList<Flower> flowersList = new ArrayList();
        Computer computer1 = new Computer("Mac",1600,13.3,"White",256);
       // flowersList.add(computer1); you cannot add computer into the flowerList since specified Object type is Flower

        flowersList.add(flower1);

        flowersList.add(flower2);
        flowersList.add(flower3);

        for (Flower flower: flowersList){

            System.out.println(flower.name +" is $"+flower.price);
        }

        System.out.println(totalPrice(flowersList));

        // calling totalPrice1 method from Flower class
        double flowerCost = Flower.totalPrice1(flowersList);
        System.out.println("This is cost calculation from totalPrice1 method "+flowerCost);
    }
    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    public static double totalPrice(ArrayList<Flower> vase){
        double sum = 0;
        for (Flower flower: vase){
            sum += flower.price;
        }
        return sum;
    }


}
