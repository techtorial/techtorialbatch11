package OOP.Encapsulation;

public class CityTest {

    public static void main(String[] args) {

        City city = new City();
        System.out.println(city.getName());
        city.setName("Chicago");
        System.out.println(city.getName());

        City city1 = new City();
        System.out.println(city1.getState());


    }

}
