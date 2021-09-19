/*
Assignment 3.1 - CIS505 - Kylie Gregory 9/19/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {

    private double balance = 200.00; // default account balance is 200 USD

    public double getBalance() { // accessor method for account balance data field
        return balance;
    }

    public void deposit(double amt) { // adds an amount to account balance after a deposit
        this.balance += amt;
    }

    public void withdraw(double amt) { // subtracts an amount from account balance after a withdrawal
        if(this.balance >= amt) {
            this.balance -= amt;
        }
    }

    public void displayMenu() { // prints a menu
        System.out.print("Account Menu\nEnter <D/d> for deposit\nEnter <W/w> for withdraw\nEnter <B/b> for balance\n  Enter option>: ");
    }

    public String getTransactionDate() { // returns the date of a transaction in the format MM-dd-yyy
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(date);
    }
}