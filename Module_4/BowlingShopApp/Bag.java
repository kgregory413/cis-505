/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Bag extends Product {
    private String type = ""; // a string value that specifies the number of balls a bag can hold, empty by default

    public Bag () { // a no argument constructor that creates a default bag
        super();
        this.type = "";
    }

     // access methods for the type field
     public String getType() {
        return type;
    }

    //mutator methods for the type field
    public void setType(String type)
    {
       this.type = type;
    }

    // override the toString() method to return a string description for a ball
    // with each of the four data fields on separate lines

    @override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}
