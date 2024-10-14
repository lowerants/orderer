package edu.psu.ist;

import java.util.ArrayList;
public class OrdererAL<T> implements Orderer<T>{
    private boolean inAddState;

//    private IllegalStateException ise;
    private ArrayList<T> list;
    @Override
    public void crank() {

    }

    @Override
    public void add(T item) throws IllegalStateException {
//        if(!inAddState) {
//            throw IllegalStateException;
//        }
        if(list.isEmpty()) {
            list.add(item);
        }
        else {
            for(int i = 0; i < list.size(); i++) {
                if(item < list.get(i)) { // need to implement comparator
                    list.add(i, item);
                    return;
                }
            }
            // if the element is greater than the last element
            list.addLast(item);
        }
    }

    @Override
    public void remove(T item) {
        //        if(inAddState) {
        //            throw IllegalStateException;
        //        }

        // skipping contains because it adds O(n) runtime
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) == item) { // if element is found
                list.remove(i); // removes element
                return;
            }
        }

        // do I need to do anything if the element wasn't in it?
    }
}
