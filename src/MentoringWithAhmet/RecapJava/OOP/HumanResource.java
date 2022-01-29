package MentoringWithAhmet.RecapJava.OOP;

public class HumanResource extends Officer{

    String employeeDocument;

    public void hiring(){
        System.out.println("Employee is being hired");
    }

    @Override
    public void trial() {

    }

    @Override
    public void work() {
        System.out.println("Human resource is working");
    }
}
