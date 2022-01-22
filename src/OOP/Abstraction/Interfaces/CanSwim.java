package OOP.Abstraction.Interfaces;

public interface CanSwim {

    int FIN = 3;

    int swim(int mile);

    default void info(){
        System.out.println("Info from Can SWim");
    }

}
