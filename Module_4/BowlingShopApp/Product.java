/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Product {

    private String code = ""; // a string value that specifies product code, empty by default
    private String description = ""; // a string value that specifies product description, empty by default
    private double price = 0; // an double value that specifies a price of a product, zero by default

    public Product() { // a no argument constructor that creates a default Product
        this.code = "";
        this.description = "";
        this.price = 0.0;
    }

    // mutator methods for each of the previous data fields
    public void setCode(String code)
    {
        this.code = code;
    }

    public void setDescription(String newDescription)
    {
        Description = newDescription;
    }

    public void setPrice(Double newPrice)
    {
        price = newPrice;
    }

     // access methods for each of the previous data fields
     public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // override the toString() method to return a string description for a product
    // with each of the three data fields on separate lines

    @override
    public String toString() {
        return "--Product Listing--\nProduct code: " + code + "\nDescription: " + description + "\nPrice: $" 
        + String.valueOf(price) + "\n";
    }
}
