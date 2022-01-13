package accessModifiers;

public class Animal {

    public String namePublic;

    private String colorPrivate;

    public String getColorPrivate() {
        return colorPrivate;
    }

    public void setColorPrivate(String colorPrivate) {
        this.colorPrivate = colorPrivate;
    }

    protected int ageProtected;

    String breedDefault;

    public void speakPublic(){
        eatPrivate();
        System.out.println("Speaking");
    }

    private void eatPrivate(){
        System.out.println("Eating");
    }
    protected void runProtected(){
        System.out.println("Running");
    }
    void sleepDefault(){
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eatPrivate();
        animal.colorPrivate = "White";
        System.out.println(animal.colorPrivate);
    }



}
