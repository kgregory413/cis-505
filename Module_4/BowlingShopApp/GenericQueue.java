/*
Assignment 4.2 - CIS505 - Kylie Gregory 9/23/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import java.util.LinkedList;

public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addFirst(item);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }
}