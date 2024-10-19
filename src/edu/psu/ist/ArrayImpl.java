package edu.psu.ist;

import java.util.ArrayList;
import java.util.Comparator;
public class ArrayImpl<U> implements Orderer<U>{
    private boolean accepting;

    private ArrayList<U> contents;
    private Comparator o;

    public ArrayImpl(Comparator<U> o) {
        this.contents = new ArrayList<U>();
        this.accepting = true;
        this.o = o;
    }

    @Override
    // O(nlogn)
    public void crank() {
        this.accepting = !this.accepting;
        this.contents.sort(o); // O(nlogn)
    }

    @Override
    public boolean isAccepting() {
        return this.accepting;
    }
    @Override
    public boolean isEmpty() {
        return this.contents.isEmpty();
    }

    @Override
    // O(1)
    public void add(U item) throws IllegalStateException {
        if(!this.accepting) {
            throw new IllegalStateException("You're");
        }
//        if(contents.isEmpty()) {
            this.contents.add(item);
//        }
//        else {
//            if(o.compare(item, this.contents.getFirst()) < 0) {
//                this.contents.addFirst(item);
//            }
//            else {
//                for(int i = 1; i < this.contents.size(); i++) { // loops through ArrayList
//                    if(o.compare(item, this.contents.get(i)) < 0) {
//                        this.contents.add(i, item);
//                        return;
//                    }
//                }
//            }
//
//        }
    }

    @Override
    // O(n)
    public U remove() {
        if(this.accepting) {
            throw new IllegalStateException("HOMO");
        }
//        else if (this.contents.size() == 1) {
//            return this.contents.removeFirst();
//        }
//
//        int removal = 0;
//        // skipping contains because it adds O(n) runtime
//        for(int i = 0; i < contents.size()-1; i++) {
//            if(this.o.compare(contents.get(removal), contents.get(i+1)) > 0) {
//                removal = i+1;
//            }
//        }
        return contents.removeFirst(); // removes element
        // O(n)


        // do I need to do anything if the element wasn't in it?
    }


    public String toString() {
        return this.contents.toString();
    }


}
