package immutable;

public class Phone {

    private double price=400;
    private String color = "blue";
    private String brand = "own";



    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }



    public static void main(String[] args) {

        Phone phone = new Phone();

        System.out.println(phone.price);
        phone.price= 900;
        System.out.println(phone.price);

    }

}
