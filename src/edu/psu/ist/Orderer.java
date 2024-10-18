package edu.psu.ist;

import java.util.ArrayList;
import java.util.LinkedList;
public interface Orderer<T> { // stub
    public void add(T item);
    public void crank(); // toggles add and remove state
    public boolean isAccepting();
    public T remove();
    public boolean isEmpty();
}

