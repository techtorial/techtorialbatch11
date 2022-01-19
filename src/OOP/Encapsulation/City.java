package OOP.Encapsulation;

public class City {

    private String name;
    private int population;
    private String state;
    private int establishmentYear;
    public String flag;
    // setter
    public void setName(String name){
      this.name = name;
    }
    public void setPopulation(int population){

        this.population = population;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setEstablishmentYear(int establishmentYear){
        this.establishmentYear = establishmentYear;
    }
    // getters
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    public int getEstablishmentYear(){
        return this.establishmentYear;
    }
    public String getState(){
        return this.state;
    }

}
