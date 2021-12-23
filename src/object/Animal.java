package object;

public class Animal {

    // instance variables
    String name;
    int age;
    String color;
    String breed = "Boxer";
    int energy =100;


    public void sleep(){
        int height=2;

        energy = 100;
        System.out.println(name+ " is sleeping");
        System.out.println(name+ " is charging up...");
        System.out.println("Now "+name+"'s energy is "+energy);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void run(){
        energy = energy - 10;
        System.out.println(name+" has "+energy+" percent energy");
    }
    public void info(){

        System.out.println("Name is: "+name+ " Age is: "+ age+" Color is: "+ color+" Breed is: "+breed+ " Energy is: "+ energy);
    }

}
