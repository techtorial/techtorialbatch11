package object;

public class TestStatic {
    public static void main(String[] args) {

        // you can call static methods from
        // another class by using name of the class, no need to create object
       StaticPetPractice.eat();
       StaticPetPractice pet = new StaticPetPractice();
       pet.eat();
       pet.play();
        System.out.println(pet.food);

    }
}
