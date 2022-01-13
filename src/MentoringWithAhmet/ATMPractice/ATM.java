package MentoringWithAhmet.ATMPractice;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //first let's create a password and cardNumber
        //second let's create a scanner to get data from the user username and password
        //if i get the wrong password or username 3 times stop the code and say ""Your account is hold. Please contact with customer service"
        //let's use do while for it and put if conditions
        //if correct then say "Welcome to Bank of America ATM Machine" and "What would you like to do today ?"
        //Options: "Withdrawal Deposit Balance Payments Change the Password Exit"
        //*tips: switch is good to be used for this example

        //Bills: Gas Electricity Garbage  Shopping
        //cost:  45, 69.55, 24.33, 12.44
        //options for withdrawal: 5, 10, 20, 30, 40, 50, 75, 100

        Scanner scan = new Scanner(System.in);
        String newCardNumber = "123456789";
        String newPassword = "ahmet";
        int choice ;
        int counter = 3;
        double balance = 100;
        String mychoice = "";
        String[] bills = new String[]{"Gas", "Electricity", "Garbage", "Shopping"};
        double[] cost = new double[]{45, 69.55, 24.33, 12.44};
        int[] options = new int[]{5, 10, 20, 30, 40, 50, 75, 100};
        OUTER:
        do {
            System.out.println("Please enter card-Number");
            String cardNumber = scan.next();
            System.out.println("Please enter the password");
            String password = scan.next();
            INNER:
            if (newCardNumber.equals(cardNumber) && newPassword.equals(password)) {
                do {
                    System.out.println("Welcome to Bank of America ATM Machine");
                    System.out.println("What would you like to do today ?");
                    System.out.println("1-Withdrawal\n2-Deposit\n3-Balance\n4-Payments\n5-Change the Password\n6-Exit");
                    choice = scan.nextInt();

                    switch (choice) {
                        case 1:

                            for (int i = 0; i < options.length; i++) {
                                System.out.print(options[i] + "$ ");
                            }
                            System.out.println("\nhow much you would like to withdraw :");
                            int withdraw = scan.nextInt();
                            if (balance > withdraw) {
                                balance -= withdraw;
                                System.out.println("You successfully withdrew " + withdraw + "$ " + "Your current balance is : " + balance);
                            } else {
                                System.out.println("You do not have enough balance!!! " + " Your current balance is : " + balance);
                            }
                            break;
                        case 2:
                            System.out.println("how much you would like to deposit :");
                            int deposit = scan.nextInt();
                            balance += deposit;
                            System.out.println("You successfully deposit " + deposit + "$ in your account!!! Your current balance is : " + balance);
                            break;
                        case 3:
                            System.out.println("Your Balance is : " + balance);
                            System.out.println("Would you like to continue? <Y> or <N>");
                            mychoice = scan.next();
                            if (mychoice.equalsIgnoreCase("N")) {
                                System.out.println("You are safelly logging out!!!Have a great day ");
                                break OUTER;
                            }
                            break;
                        case 4:
                            for (int i = 0; i < bills.length; i++) {
                                System.out.println(bills[i] + " = " + cost[i]);
                            }
                            System.out.println("Please write the name of bill that you want to pay :");
                            String name = scan.next();
                            for (int k = 0; k < bills.length; k++) {
                                if (name.equalsIgnoreCase(bills[k])) {
                                    if (balance > cost[k]) {
                                        balance -= cost[k];
                                        System.out.println("You successfully paid the " + name + " bill " + "current balance is : " + balance);
                                        bills[k] = "Paid";
                                        cost[k] = 0;
                                        break;
                                    } else {
                                        System.out.println("You do not have enough balance or wrong input");
                                        break;
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Please enter your old password");
                            String oldPassword = scan.next();
                            if (oldPassword.equals(password)) {
                                System.out.println("Please enter new password");
                                newPassword = scan.next();
                                System.out.println("You successfully changed your password " + newPassword);
                                break INNER;
                            } else {
                                System.out.println("Your old password is not matching what you input");
                                break;
                            }

                        case 6:
                            System.out.println("You are safelly logging out!!!Have a great day ");
                            break OUTER;
                    }

                } while (true);

            } else {
                counter--;
                System.out.println("Your cardNumber or Password is not correct " + counter + " chances left");
                if (counter == 0) {
                    System.out.println("Your account is hold. Please contact with customer service");
                    break;
                }
            }
        } while (true);
    }
}
