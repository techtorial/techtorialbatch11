package OOP.inheritance1;

public class Rose extends Flower {

    String smell;
    double price;

    public Rose(String smell){

    super("Red",4.99,9);
        this.smell = smell;
    }


    public double getPrice(){

        return price;
    }
    public static void main(String[] args) {

        Flower flower = new Flower("Yellow",2.99,5);
        System.out.println(flower.color);// yellow

        Rose rose = new Rose("sweet");
        System.out.println(rose.color);// red

        System.out.println(flower.price);
        System.out.println(flower.getPrice());
        System.out.println(rose.getPrice());
        System.out.println(rose.price);

        Flower flower1 = new Flower();
        System.out.println(flower1.getPrice());

        System.out.println(flower1.size);
        flower1.price = 8.99;

        System.out.println(flower1.getPrice());
        System.out.println(flower1.price);

        System.out.println(flower1);
        System.out.println(rose);


    }



}
