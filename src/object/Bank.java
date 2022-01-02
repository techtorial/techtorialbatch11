package object;

import loops.while_DoWhile.RandomPractice;

public class Bank {
    /*
            -accountHolderName, balance, accountNumber, userName, password, isLoggedIn
            -create a method that will display all account information
            -create a method that will be named as deposit(), and it will update balance
            -create a method that will be named as withdraw(), and it will update balance
            -create a method that will be named as logIn(),
                        and will check if the user logged in or not and returns true/false
     */
    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String passWord;
    boolean isLoggedIn = false;

    public Bank(String accountHolderName, double balance, String userName, String passWord) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.userName = userName;
        this.passWord = passWord;
        this.accountNumber = Student.createHour();
    }

    public void printInfo() {
        if (isLoggedIn == true) {
            System.out.println(accountHolderName + " " + balance + " " + accountNumber + " "
                    + userName + " " + passWord + " " + isLoggedIn);
        }else {
            System.out.println("you should log in first to see your full info LogIn status--> "+ isLoggedIn);
        }
    }

    public double deposit(double depositAmount) {

        return balance += depositAmount;

    }

    public double withdraw(double withdrawAmount) {

        return balance -= withdrawAmount;

    }

    public boolean logIn(String userNAME, String passWORD) {

        if (userName.equals(userNAME) && passWord.equals(passWORD)) {
            isLoggedIn = true;

            System.out.println("You logged in successfully");
        } else {
            System.out.println("username or password is not matching");
        }
        return isLoggedIn;
    }

    public static void main(String[] args) {
        Bank c1 = new Bank("Zack", 200, "zack123", "123");
        c1.printInfo();
        c1.logIn("zack123", "123");

        c1.printInfo();
    }

}
