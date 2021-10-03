/*
Assignment 5.1 - CIS505 - Kylie Gregory 10/3/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.util.Scanner;

public class ValidatorIO {
    
    //  Scanner argument named sc and a string argument named prompt
    // and an Integer return type

    public static Integer getInt(Scanner sc, String prompt) {
        
        Integer input = 0;
        
        boolean isValid = false;

        while(!isValid) {

            System.out.print(prompt);

            if(sc.hasNextInt()) {

                input = sc.nextInt();
                isValid = true;
            }

            else {
                System.out.println("\n Error! Invalid integer value.");
            }
            sc.nextLine();
        }

        return input;
    }

    //  A static method named getDouble with a Scanner argument named sc and a string 
    // argument named prompt and a double return type.

    public static Double getDouble(Scanner sc, String prompt) {

        Double input = 0.0;
        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            }
            else {
                System.out.println("\n Error! Invalid double value.");
            }
            sc.nextLine();
        }

        return input;
    }

    // A static method named getString with a Scanner argument named sc and a string 
    // argument named prompt and a string return type. 
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.next();
        sc.nextLine();
        return input;
    }

}
