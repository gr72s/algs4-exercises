package fundamentals.StacksAndQueues;

import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-19 15:54
 * @package fundamentals.StacksAndQueues
 * @modified Greekn
 * @description
 */
public class Ex_1_3_34_RandomBag<T> implements Iterable {
    private T[] arrays = (T[]) new Object[10];
    private int N = 0;

    public Ex_1_3_34_RandomBag() {
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void add(T t) {
        arrays[N++] = t;
    }

    @Override
    public Iterator iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
