package OOP.inheritance1;

public class Flower {

    String color;
    double price;
    int size;

    public Flower(String color, double price, int size) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Flower(){
        this("White",1, 1);
    }


public double getPrice(){
        return price;
}

    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
