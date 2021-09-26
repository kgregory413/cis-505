/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Shoe extends Product {

    private double size = 0; // a string value that specifies the shoe size, empty by default

    public Shoe () { // a no argument constructor that creates a default shoe
        super();
        this.size = 0.0;
    }

     // access methods for the color field
     public double getSize() {
        return size;
    }

    //mutator methods for the shoe field
    public void setSize(Double size)
    {
       this.size = size;
    }

    // override the toString() method to return a string description for a shoe
    // with each of the four data fields on separate lines

    @override
    public String toString() {
        return super.toString() + "\nSize: " + String.valueOf(size);;
    }
}