package OOP.Abstraction.Interfaces;

public class Test {

    public static void main(String[] args) {
        //   CanFly canFly = new CanFly(); you cannot create an instance of interface

        Shark shark = new Shark();
        shark.swim(4);


        Eagle eagle = new Eagle();
        eagle.color = "Black";
        eagle.fly();

        Duck duck = new Duck();

        duck.fly();
        duck.swim(2);

        System.out.println(shark);
        System.out.println(eagle);
        System.out.println(duck);
        System.out.println(duck.NUMOFWINGS);
        System.out.println(duck.FIN);
        // duck.FIN = 0; you can not re-initialize
        // variables which are coming from interface
        // interface variables are public and final by default

        duck.info();

        System.out.println(duck.name);
        duck.name = "Puffy";
        System.out.println(duck.name);

        Puffin puffin = new Puffin();
        puffin.run();

    }

}
