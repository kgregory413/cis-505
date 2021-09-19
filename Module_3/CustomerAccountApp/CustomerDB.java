/*
Assignment 3.1 - CIS505 - Kylie Gregory 9/19/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

// getCustomer compares data field against values 1007, 1008, and 1009.
// For each match, returns a new customer object with unique fields.  If there are no matches, returns a default customer object.
public class CustomerDB {
    public static Customer getCustomer(int id) {
        if(id == 1007) {
            return new Customer("Trenton Downe", "1001 Westpark Way", "Chaska", "55318");
        }
        else if(id == 1008) {
            return new Customer("Malinda Brooke", "123 Happy Ave.", "Orlando", "34747");
        }
        else if(id == 1009) {
            return new Customer("Mark Hamill", "4205 Coral Springs Dr.", "Ft. Worth", "76123");
        }
        else {
            return new Customer();
        }
    }
}