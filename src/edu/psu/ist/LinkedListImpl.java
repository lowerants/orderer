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
    // O(1)
    public void add(U item) {
        this.list.addFirst(item); // O(1)
    }

    @Override
    // O(1)
    public void crank() {
        this.accepting = !this.accepting;
    }

    @Override
    // O(1)
    public boolean isAccepting() {
        return this.accepting;
    }

    @Override
    // O(2n)
    public U remove() throws IllegalStateException {
        if(this.accepting) {
            throw new IllegalStateException("Crank to begin removal");
        }
        else if (this.list.size() == 1) {
            return this.list.removeFirst();
        }

        int removal = 0;
        // skipping contains because it adds O(n) runtime
        for(int i = 0; i < this.list.size()-1; i++) { // O(n)
            if(this.o.compare(this.list.get(removal), this.list.get(i+1)) > 0) { // O(1)
                removal = i+1;
            }
        }

        return this.list.remove(removal); // removes element
        // O(n)
    }

    @Override
    // O(1)
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