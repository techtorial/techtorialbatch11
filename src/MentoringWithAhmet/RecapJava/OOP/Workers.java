package MentoringWithAhmet.RecapJava.OOP;

public class Workers {
    String name;
    String lastName;
    String Phone;
    private String email="default@gmail.com";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }else{
            System.out.println("please provide a valid format");
        }

    }

    public void Enter(){
        System.out.println("Your entry time successfully recorded ");
    }
    public void leave(){
        System.out.println("Your dissmiss time successfully recorded");
    }
    public void lunch(){
        System.out.println("Lunch time");
    }
}
