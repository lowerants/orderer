package edu.psu.ist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrdererTests {

    // @Test methods go in here...
    @Test
    public void testArrayImplAdd() {
        Orderer<Integer> arr = new ArrayImpl<Integer>(Integer::compare);
//        Orderer<Integer> lis = new LinkedListImpl<Integer>(Integer::compare);
        arr.add(1);
        arr.add(-1);
        arr.add(4);
        arr.add(-4);

        Assertions.assertEquals("[1, -1, 4, -4]", arr.toString());
//        Assertions.assertEquals("[-4, -1, 1, 4]", arr.toString());
    }

    @Test
    public void testArrayImplRemove() {
        ArrayImpl<Integer> arr = new ArrayImpl<Integer>(Integer::compare);
        arr.add(1);
        arr.add(-1);
        arr.add(4);
        arr.add(-4);
        arr.crank();
        arr.remove();
        Assertions.assertEquals("[-1, 1, 4]", arr.toString());
    }

    @Test
    public void testLinkedListImplAdd() {
        LinkedListImpl<Integer> arr = new LinkedListImpl<Integer>(Integer::compare);
        arr.add(1);
        arr.add(-1);
        arr.add(4);
        arr.add(-4);
        Assertions.assertEquals("-4 -> 4 -> -1 -> 1 -> null", arr.toString());
    }

    @Test
    public void testLinkedListImplRemove() {
        LinkedListImpl<Integer> arr = new LinkedListImpl<Integer>(Integer::compare);
        arr.add(1);
        arr.add(-1);
        arr.add(4);
        arr.add(-4);
        arr.crank();
        arr.remove();
        Assertions.assertEquals("4 -> -1 -> 1 -> null", arr.toString());
    }

    @Test
    public void testArrayThrows() {
        ArrayImpl<Integer> arr = new ArrayImpl<>(Integer::compare);
        try {
            arr.add(1);
            arr.add(2);
            arr.remove();
        }
        catch(IllegalStateException ise) {
            Assertions.assertEquals("[1, 2]", arr.toString());
        }
    }

    @Test
    public void testLinkedThrows() {
        LinkedListImpl<Integer> arr = new LinkedListImpl<Integer>(Integer::compare);
        try {
            arr.add(1);
            arr.add(2);
            arr.remove();
        }
        catch(IllegalStateException ise) {
            Assertions.assertEquals("2 -> 1 -> null", arr.toString());
        }

    }
}
