package MentoringWithAhmet.RecapJava.OOP;

public class SecurityGuard extends Officer{
    String SecurityDocument;

    public void guardDuty(){
        System.out.println("Guard is on duty");
    }

    @Override
    public void trial() {

    }

    @Override
    public void work() {
        System.out.println("Security guard is working");
    }
}
