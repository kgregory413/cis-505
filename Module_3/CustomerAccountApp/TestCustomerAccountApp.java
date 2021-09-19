/*
Assignment 3.1 - CIS505 - Kylie Gregory 9/19/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class TestCustomerAccountApp {

    public static void main(String[] args) { // prompts user to enter a customer number between 1007 and 1009
        System.out.println("\nWelcome to the Customer Account App\n");
        System.out.print("Enter a customer ID:\n  ex: 1007, 1008, 1009>: ");

        Scanner input = new Scanner(System.in);
        Customer customer = CustomerDB.getCustomer(input.nextInt());
        Account account = new Account();
        System.out.println();

        String menuDecision;
        String continueDecision = "y";

        do{
            account.displayMenu();
            menuDecision = input.next();
            switch(menuDecision) {
                // user selects the deposit menu
                case "D": case "d":
                    System.out.print("\nEnter deposit amount: ");
                    account.deposit(input.nextDouble());
                    break;
                // user selects the withdraw menu
                case "W": case "w":
                    System.out.print("\nEnter withdraw amount: ");
                    account.withdraw(input.nextDouble());
                    break;
                // user selects the balance menu
                case "B": case "b":
                    System.out.printf("\nAccount balance: $%,6.2f\n", account.getBalance());
                    break;
                // Error message for invalid selections
                default:
                    System.out.println("\nError: Invalid option");
                    break;
            }

            // give user the option to quit or continue
            System.out.print("\nContinue? (y/n): ");
            continueDecision = input.next();

            System.out.println();
        } while(continueDecision.charAt(0) == 'y');

        // displays customer details and account balance
        System.out.println(customer.toString());
        System.out.printf("Balance as of %s is $%,6.2f\n", account.getTransactionDate(), account.getBalance());

        System.out.println("\nEnd of line...");
        input.close();
    }
}