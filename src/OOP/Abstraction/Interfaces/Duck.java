package OOP.Abstraction.Interfaces;


import OOP.inheritance.Animal;

public class Duck extends Animal implements CanFly,CanSwim {

    public void fly(){
        System.out.println("Duck is flying");
    }
    public int swim(int km){
        System.out.println("Duck is swimming");
        return km;
    }

    public void info(){
        System.out.println("DUCK info");
    }
}
