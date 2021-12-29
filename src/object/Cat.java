package object;

public class Cat {

    String name;
    int age;
    String color;
    int foodAmount;
    // create a method named as run(), it will take a parameter as destination,
    //  it will reduce food amount by 1 for every execution
    //it will print out as "Cat is running ...<west>"

// overload the run method with your own preference
    public void run(String destination){
        foodAmount -=1;
        System.out.println(name + " is running to "+destination);

    }
    public void run(){
        System.out.println("OverLoaded run method in the Cat class");
    }

    //=======================================
    // create a method named as setColor(), it will take a parameter and initialize the color of the cat
    public void setColor(String newColor){
        color=newColor;
    }
    //=======================================
    // create a method that will return color of cat, name it as getColor()

    public String getColor(){
        return color;
    }
    //=======================================
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Ginger";
        cat1.color = "Orange";
        cat1.age = 3;
        cat1.foodAmount=10;
        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.setColor("White");
        System.out.println(cat1.color);
        System.out.println("this is coming from get color method==> "+cat1.getColor());

    }

}
