/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {

        // Creates scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Bowling Shop\n\n");

        String selection = " ";

        // Create new Generic Queue to store product information
        GenericQueue<Product> products = new GenericQueue<Product>();

        // Loops over menu selection until user selects option 'x'
        while(selection.charAt(0) != 'x') {

            displayMenu();
            selection = String.valueOf(input.nextLine().charAt(0));
            products = ProductDB.getProducts(selection);
            System.out.println("\n--Product Listing--");
            while(products.size() > 0) {

                System.out.println(products.dequeue().toString()+"\n");

            }
        }
        input.close();
    }
    // displayMenu exectution
    public static void displayMenu() {

        System.out.print("MENU OPTIONS\n  1. <b> Bowling Balls"
            +"\n  2. <a> Bowling Bags\n  3. <s> Bowling Shoes"
            +"\n  4. <x> To exit\n\nPlease choose an option: ");
    }
}