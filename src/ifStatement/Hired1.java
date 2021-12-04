package ifStatement;

import java.util.Scanner;

public class Hired1 {


    public static void main(String[] args) {
        /*

  nested if >>>> java>selenium>API>Sql
  ask user:
        -s/he knows Java yes/no
                yes: ask s/he knows Selenium
                        can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congrats!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, Do you know Java? yes / no");
        String java = input.nextLine();
        if (java.equalsIgnoreCase("yes")){

            System.out.println("Do you have Selenium Experience? yes / no / learn");
            String selenium= input.nextLine();

            if (selenium.equalsIgnoreCase("yes") ){
                System.out.println("do you have API testing experience");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have Sql knowledge? yes/ no");
                    String sql = input.nextLine();

                    if (sql.equalsIgnoreCase("yes")){

                        System.out.println("Congrats!! HIRED!!!");
                    }else{
                        // sql  response
                        System.out.println("We need someone with sql knowledge");
                    }
                }else{
                    // api response
                    System.out.println("We need someone with API knowledge");
                }
            }else if(selenium.equalsIgnoreCase("learn")){
                System.out.println("do you have API testing experience");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have Sql knowledge? yes/ no");
                    String sql = input.nextLine();

                    if (sql.equalsIgnoreCase("yes")){

                        System.out.println("Congrats!! HIRED!!!");
                    }else{
                        // sql  response
                        System.out.println("We need someone with sql knowledge");
                    }
                }else{
                    // api response
                    System.out.println("We need someone with API knowledge");
                }
            }
            else {
                // thi is for selenium question
                System.out.println("We need someone with Selenium knowledge");
            }
        }else {
            // this is for java answer
            System.out.println("You should learn at least one programming language");

        }
    }
}
