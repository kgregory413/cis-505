/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Ball extends Product {
    private String color = ""; // a string value that specifies the ball color, empty by default

    public Ball () { // a no argument constructor that creates a default ball
        super();
        this.color = "";
    }

     // mutator methods for the shoe field
    public void setColor(String color)
    {
        this.color = color;
    }

     // access methods for the color field
     public String getColor() {
        return color;
    }

    // override the toString() method to return a string description for a ball
    // with each of the four data fields on separate lines

    @override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}