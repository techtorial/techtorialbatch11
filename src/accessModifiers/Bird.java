package accessModifiers;

public class Bird extends Animal{

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleepDefault();
        animal.speakPublic();
        animal.runProtected();
    }
}
