package MentoringWithAhmet.ATMPractice;

import java.util.Scanner;

public class ATM {
    //first let's create a password and cardNumber
//second let's create a scanner to get data from the user CardNumber and password
//if i get the wrong password or cardNumber 3 times stop the code and say ""Your account is hold. Please contact with customer service"
//let's use do while for it and put if conditions
//if correct then say "Welcome to Bank of America ATM Machine" and "What would you like to do today ?"
//Options: "Withdrawal Deposit Balance Payments Change the Password Exit"
    //*tips: switch is good to be used for this example

    //Bills: Gas Electricity Garbage  Shopping
//cost:  45, 69.55, 24.33, 12.44
//options for withdrawal: 5, 10, 20, 30, 40, 50, 75, 100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String newCardNumber = "12345";
        String newPassword = "123";
        double balance = 100;
        int[] options = {5, 10, 20, 30, 40, 50, 75, 100};
        String[] bills = {"Gas","Electricity","Garbage","Shopping"};
        double[] cost={45,69.55,24.33,12.44};
        do {
            System.out.println("Please enter your card Number : ");
            String cardNumber = scan.nextLine();
            System.out.println("Please enter your password : ");
            String password = scan.nextLine();
            if (cardNumber.equals(newCardNumber) && password.equals(newPassword)) {
                do {

                    System.out.println("Welcome to Bank of America ATM Machine");
                    System.out.println("What would you like to do today?");
                    System.out.println("1-Withdrawal\n2-Deposit\n3-Balance\n4-Payments\n5-Change The Password\n6-Exit");
                    int choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            for (int i = 0; i < options.length; i++) {
                                System.out.print(options[i] + " $ ");
                            }
                            System.out.println("How much would you like to withdraw ");
                            double withdraw = scan.nextDouble();
                            if (balance >= withdraw) {
                                balance -= withdraw;
                                System.out.println("You successfully withdraw the amount " + withdraw + "from your account." +
                                        "Your current balance is : " + balance);
                            } else {
                                System.out.println("The amount that you would like to withdraw is not enough" +
                                        "Your current balance is :" + balance);
                            }
                            break;
                        case 2:
                            for (int i = 0; i < options.length; i++) {
                                System.out.print(options[i] + " $ ");
                            }
                            System.out.println("How much would you like to deposit ");
                            double deposit = scan.nextDouble();
                            balance += deposit;
                            System.out.println("You successfully deposit the amount " + deposit + "from your account." +
                                    "Your current balance is : " + balance);

                            break;
                        case 3:
                            System.out.println("Your Balance is :" + balance);
                            break;
                        case 4:
                            for(int i = 0; i< bills.length;i++){
                                System.out.println(bills[i] +"  " +cost[i]);
                            }
                            Scanner scan1 = new Scanner(System.in);
                            System.out.println("Which bills you would like to pay ?");
                            String billsName=scan1.nextLine();
                            for(int k = 0; k<bills.length;k++){
                                if(billsName.equalsIgnoreCase(bills[k])){
                                    if(balance>=cost[k]){
                                        balance-=cost[k];
                                        System.out.println("You successfully paid the " + billsName+ " bill " + "current balance is "+ balance);
                                    }else{
                                        System.out.println("You do not have enough balance for it");
                                    }

                                }
                            }

                    }



                    break;
                } while (true);
            } else {
                System.out.println("Your cardnumber or password is not matching? Please do it again");
            }
            while (true) ;


        } while (true);
    }
}
