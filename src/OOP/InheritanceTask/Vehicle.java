package OOP.InheritanceTask;

public class Vehicle {
    protected String model;
    int year;
    public String brand;

    public Vehicle(String model, int year, String brand){
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    void drive(){
        System.out.println("vehicle is moving");
    }
     boolean stop(boolean isStopped){
        System.out.println("Is vehicle Stopped? ");
        return isStopped;
    }
    protected boolean start(boolean isStarting){
        System.out.println("Is vehicle started? ");
        return isStarting;
    }
    Vehicle accelerate(){
        System.out.println("Vehicle is accelerating >>>");
        return new Vehicle(model, year, brand);
    }
}
