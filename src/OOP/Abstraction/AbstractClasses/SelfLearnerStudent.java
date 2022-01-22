package OOP.Abstraction.AbstractClasses;

public class SelfLearnerStudent extends Student {

    public void attend() {
        System.out.println("Self Learner is attending");
    }

    public void watch() {
        System.out.println("Self learner is watching");
    }

    public void sleep(int hour) {
        System.out.println("Self learner is sleeping");
    }

    public SelfLearnerStudent() {
        super("Halicha", 22);
    }
}
