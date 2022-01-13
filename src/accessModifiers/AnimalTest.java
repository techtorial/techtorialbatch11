package accessModifiers;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.runProtected();
        animal.sleepDefault();
        animal.setColorPrivate("Black");
        animal.getColorPrivate();

    }
}
