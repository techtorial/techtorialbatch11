package MentoringWithAhmet.RecapJava;

public class Human {
    int age=30;
    String name = "Ahmet";
    double height= 6.2;
    String eyecolor="Brown";
    double amountofMuscles = 45;
    double theweightofskeleton=53;

    public void speak(){
        System.out.println(name + "is speaking");
    }
    public double calculation(){
        return amountofMuscles+theweightofskeleton;
    }
}
