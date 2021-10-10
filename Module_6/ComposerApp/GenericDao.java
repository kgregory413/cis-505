/*
Assignment 6.2 - CIS505 - Kylie Gregory 10/10/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import java.util.List;

// An interface named GenericDao used to represent the operations in a data persistence layer.

public interface GenericDao<E, K> {
    
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);

}