package OOP.Abstraction.Interfaces;

public class Shark implements CanSwim{

    public int swim(int mile){

        System.out.println("Shark is swimming very fast");
        return mile*3;
    }

}
