/*
Assignment 3.1 - CIS505 - Kylie Gregory 9/19/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Customer {
    private String name; //specifies customer name
    private String address; //specifies customer address
    private String city; //specifies customer city
    private String zip; //specifies customer zip code
    
    // constructor that creates a default Customer
    public Customer() {
    }
    
    // constructor that creates a customer using previous data fields
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    // access methods for each of the previous data fields
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
  
    // override the toString() method to return a string description for a customer
    // with each of the four data fields on separate lines

    @override
    publix String toString() {
        return "--Customer Details--\nName: " + this.name + "\nAddress: " + this.address + "\nCity: " 
        + this.city + "\nZip: " + this.zip + "\n";
    }
}
