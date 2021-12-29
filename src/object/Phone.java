package object;

public class Phone {

    String brand;
    double price = 1000;
    String color;
// constructor
    public Phone(){
        System.out.println("This is No argument constructor");
    }
// method to set color
    public void setColor(String color1){
        color = color1;
    }
    // method to call
    public void call(int number){
        System.out.println(number+" is being called");
    }

}
