/*
Assignment 5.1 - CIS505 - Kylie Gregory 10/3/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class TestExpenseTracker {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Expense Tracker\n");

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        String continueString = "y";

        // If the user enters "y," continue looping through the menu
        while(continueString.equalsIgnoreCase("y")) {

            // Display a menu to the user
            int input = ValidatorIO.getInt(sc, "\nMENU OPTIONS\n  1. View Transactions\n  2. Add Transactions"
                                            +"\n  3. View Expense\n\nPlease choose an option: ");

            switch(input) {

                // If the user selects menu item one, display all the transactions in the expenses.txt file.  
                case 1:
                    try {
                        System.out.println("\nMONTHLY EXPENSES");
                        ArrayList<Transaction> transactions = TransactionIO.findAll();

                        for(Transaction tran : transactions) {
                            System.out.printf("\n Date: %s\n Description: %s\n Amount: $%6.2f\n", tran.getDate(), tran.getDescription(), tran.getAmount());
                        }
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;

                // If the user selects menu item two, allow the user to add a new transaction to the 
                // expenses.txt file. 

                case 2:
                    String cont = "y";
                    ArrayList<Transaction> lTransactions = new ArrayList<Transaction>();

                    while(cont.equalsIgnoreCase("y")) {
                        String description = ValidatorIO.getString(sc, "\n Enter the description: ");
                        double amount = ValidatorIO.getDouble(sc, " Enter the amount: ");
                        Transaction tran = new Transaction();
                        tran.setDescription(description);
                        tran.setAmount(amount);
                        lTransactions.add(tran);
                        cont = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");
                    }
                    try {
                        TransactionIO.bulkInsert(lTransactions);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;

                // If the user selects menu item three, display the total expenses of all transactions in the 
                // expenses.txt file. 

                case 3:
                    try {
                        ArrayList<Transaction> transactions = TransactionIO.findAll();
                        double monthlyExpense = 0.0;

                        for(Transaction tran : transactions) {
                            monthlyExpense += tran.getAmount();
                        }

                        System.out.printf("\n Your total monthly expense is $%6.2f\n", monthlyExpense);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;
            }
            // Allow the user to stay in the menu by prompting them to continue.  If the user does not 
            // wish to continue, exit the program.   
            
            continueString = ValidatorIO.getString(sc, "\nContinue? (y/n): ");
        }

    }
    
} 