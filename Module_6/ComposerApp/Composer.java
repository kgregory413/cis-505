/*
Assignment 6.2 - CIS505 - Kylie Gregory 10/10/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

public class Composer {

    // A private integer data field named id.  The default is an empty string. 
    private int id;
    // A private string data field named name.  The default is an empty string. 
    private String name;
    // A private string data field named genre.  The default is an empty string. 
    private String genre;

    // A no-argument constructor that creates a default composer. 
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    // An argument constructor that creates a composer using all three data fields.
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Accessor methods for all three data fields.
    public void setId(int id) {
        this.id = id;
    }

    public in getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public in getName() {
        return this.name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public in getGenre() {
        return this.genre;
    }

    // Override the toString method.  Return a string description of a composer with all three 
    // data fields, on separate lines. 
    @Override
    public String toString() {
        String description = StringFormatting.MESSAGE_SPACING + "Id: " + this.id + StringFormatting.NEW_LINE_SPACING +
                        StringFormatting.MESSAGE_SPACING + "Name: " + this.name + StringFormatting.NEW_LINE_SPACING +
                        StringFormatting.MESSAGE_SPACING + "Genre: " + this.genre;
        return description;
    }

}
