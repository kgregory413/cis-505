/*
Assignment 5.1 - CIS505 - Kylie Gregory 10/3/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionIO {

    //A private string constant data field named FILE_NAME.  The default value is 
    // “expenses.txt”  

    private static String FILE_NAME = "expenses.txt";

    // A private File data field name file.  The default value is a new File instance. 
    
    private static File file = new File(FILE_NAME);

    // A public static method named bulkInsert with an ArrayList<Transaction> argument 
    // named transactions and a return type of void.

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

        PrintWriter output = null;
        
        // If/else statement that checks if the file exists
        // For true comparisons, a new PrintOutStream is assigned to the output variable.  
        // For false comparison, output is set to a new PrintWriter instance

        if(file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        }
        else {
            output = new PrintWriter(FILE_NAME);
        }

        for(Transaction tran : transactions) {
            output.print(tran.getDate()+" ");
            output.print(tran.getDescription()+" ");
            output.println(tran.getAmount());
        }

        output.close();

    }

    // A public static method named findAll with a return type of ArrayList<Transaction>.  
    
    public static ArrayList<Transaction> findAll() throws IOException {

        Scanner input = new Scanner(file);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        while(input.hasNext()) {
            transactions.add(new Transaction(input.next(), input.next(), input.nextDouble()));
        }

        input.close();
        return transactions;

    }
    
}