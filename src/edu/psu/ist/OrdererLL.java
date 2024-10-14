package edu.psu.ist;

import java.util.LinkedList;
public class OrdererLL<T> implements Orderer<T> {
    private LinkedList<T>  list;
    private boolean inAddState;

    @Override
    public void crank() {
        inAddState = !inAddState;
    }

    @Override
    public void add(T item) {
        if(list.isEmpty()) {
            list.add(item);
        }
        else {
            T element = list.getFirst();
            while(element. !=)
        }
    }

    @Override
    public void remove(T item) {

    }
}
