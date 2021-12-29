package object;

public class StaticPetPractice {

    String name;
    int age;
    String color;
    static double food = 20;

    public static void eat(){

        food -= 1;
        System.out.println("food amount is now: "+food);
        // to call non-static method into static method,
        // you need to create object
        StaticPetPractice pet9 = new StaticPetPractice();
       // pet9.play();
        pet9.color = "red";
    }
    public void play(){
        System.out.println("Pet is playing");
        eat();
        StaticPetPractice.eat();
        food = 100;
        color = "Blue";
    }

    public static void main(String[] args) {
        StaticPetPractice pet1 = new StaticPetPractice();
        pet1.eat();
        pet1.eat();

        StaticPetPractice pet2 = new StaticPetPractice();
        pet2.eat();
        pet1.eat();
        pet2.eat();
        //========
        eat();
        //========
        StaticPetPractice.eat();
        // non- static methods can not be called without
        // object from a static method
        //   play();
        //   StaticPetPractice.play();

    }

}
