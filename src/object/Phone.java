package object;

public class Phone {

    String brand;
    double price = 1000;
    String color;

    // constructor
    public Phone() {
        this("Navy Blue","Google");

        System.out.println("This is No argument constructor");
    }

    // constructor

    public Phone(String newColor) {
        this.color = newColor;
        System.out.println("This is ONE argument constructor");

    }
    public Phone(String newColor, String newBrand){
        this.color = newColor;
        this.brand = newBrand;
        System.out.println("This is TWO argument constructor");
    }


    // method to set color
    public void setColor(String color1) {
      color = color1;
    }

    // method to call
    public void call(int number) {
        System.out.println(number + " is being called");
    }

    public void Phone() {
        int a = 5;
        a = 9;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
//       phone.brand = "I-Phone";
//       phone.call(11111);

        Phone phone1 = new Phone();


        Phone phone2 = new Phone("Pink");

        System.out.println(phone2.color);
        System.out.println(phone1.color);

        Phone phone3 = new Phone("Black","Samsung");
    }

}
