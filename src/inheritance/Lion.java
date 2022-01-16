package inheritance;

public class Lion extends WildAnimal{


    @Override
    public WildAnimal run() {
    return new Lion();
    }
}
