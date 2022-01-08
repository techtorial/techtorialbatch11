package arrayList;

import java.util.ArrayList;

public class Flower {

    double price;
    String color;
    String name;

    public Flower(double price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }


    // create a method that will take a parameter as ArrayList of Flowers
    // this method will return total prices of the flowers

    @Override
    public String toString() {
        return "ttttttttt";
    }

    public static double totalPrice1(ArrayList<Flower> vase){
        double sum = 0;
        for (Flower flower: vase){
            sum += flower.price;
        }
        return sum;
    }


}
