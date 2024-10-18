package edu.psu.ist;

import org.w3c.dom.Node;

import java.util.Comparator;
import java.util.LinkedList;
public class LinkedListImpl<U> implements Orderer<U> {
    private LinkedList<U> list;
    private boolean accepting;
    private Comparator o;

    public LinkedListImpl(Comparator<U> o) {
        this.list = new LinkedList<U>();
        this.accepting = true;
        this.o = o;
    }

    @Override
    public void add(U item) {
        this.list.add(item);
    }

    @Override
    public void crank() {
        this.accepting = !this.accepting;
    }

    @Override
    public boolean isAccepting() {
        return this.accepting;
    }

    @Override
    public U remove() {
        if(this.accepting) {
            throw new IllegalStateException("HOMO");
        }
        else if (this.list.size() == 1) {
            return this.list.removeFirst();
        }

        int removal = 0;
        // skipping contains because it adds O(n) runtime
        for(int i = 0; i < list.size()-1; i++) {
            if(this.o.compare(list.get(removal), list.get(i+1)) > 0) {
                removal = i+1;
            }
        }

        return list.remove(removal); // removes element
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        StringBuilder returnStr = new StringBuilder();
        for (U u : this.list) {
            returnStr.append(u).append(" -> ");
        }
        return returnStr + "null";
    }
}