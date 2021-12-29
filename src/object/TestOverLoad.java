package object;

public class TestOverLoad {

    public static void main(String[] args) {
        OverLoadPractice obj = new OverLoadPractice();

        obj.sum("String example ",4,5);
        obj.sum(new int[]{1,2,3});
        obj.sum(8,9);

        Cat cat = new Cat();
        cat.run();

        MethodPractice obj2 = new MethodPractice();
        obj2.ageCalculator(1900, "Newton");
    }


}
