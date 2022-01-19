package OOP.inheritance;

public class WildAnimal extends Animal{

    String name;

    public void hunting(){

        System.out.println("Wild animal is hunting");

    }

    @Override
    public WildAnimal run() {

      System.out.println(name+" is running");
      return new WildAnimal();
    }
}
