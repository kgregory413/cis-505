/*
Assignment 6.2 - CIS505 - Kylie Gregory 10/10/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

// an interface named ComposerDao used to represent the 
// operations in a composer data persistence layer.  This interface extends the GenericDao interface, 
// using the Composer object and Integer as its generic arguments.

public interface ComposerDao extends GenericDao<Composer, Integer> {
    
}