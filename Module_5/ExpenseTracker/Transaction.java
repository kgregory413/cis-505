/*
Assignment 5.1 - CIS505 - Kylie Gregory 10/3/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    
    // a private string data field that specifies a transaction date.
    DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); // Default formatting for the date field.
    Date date = new Date();
    private String date = dateFormat.format(date);
    private String description; // A private string data field that specifies the description of a transaction. The default is an empty string.  
    private double amount; // A private double data field that specifies the amount of a transaction.  The default value is 0. 

    // Constructors for each of the three data fields above.
    public Transaction() {
        this.Description = "";
        this.Amount = 0;
    }

    public Transaction(String description, double amount) {
        this.Description = description;
        this.Amount = amount;
    }

    // Accessor and Mutator Methods for each data field.
    public void setDate(String date) {
        this.Date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    // Override the toString method.
    // Return a string description of a transaction with all three data fields, on separate lines.
    @Override
    public String toString() {
        return "Date: "+date+"\nDescription: "+description+"\nAmount: "+String.valueOf(amount)+"\n";
    }
}
