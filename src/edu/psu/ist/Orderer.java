package edu.psu.ist;

import java.util.ArrayList;
import java.util.LinkedList;
public interface Orderer<T> { // stub
    public void crank(); // toggles add and remove state
    public void add(T item);
    public void remove(T item);

}

