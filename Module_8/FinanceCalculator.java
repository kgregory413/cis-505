/*
Assignment 8.2 - CIS505 - Kylie Gregory 10/24/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

public class FinanceCalculator {
  
    //A private static int with the name MONTHS_IN_YEAR and a default value of 12.
    private static final int MONTHS_IN_YEAR = 12;
  
    // a static double method named calculateFutureValue with three parameters: double monthlyPayment, double rate, and int years.
    public double calculateFutureValue(double monthlyPayment, double rate, int years){

        //calculate the months by taking the argument years and multiplying it by the MONTHS_IN_YEAR variable.
        int months = MONTHS_IN_YEAR * years;

        //Calculate the interest rate
        rate = (1 + rate/100);

        //Calculate the presentValue by multiplying the monthlyPayment by the number of months variable.
        double presentValue = monthlyPayment * months;
             
        //Calculate the futureValue
        double futureValue = presentValue * (Math.pow(rate, months));
        return futureValue;
        
    }

  }
