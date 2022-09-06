package fundamentals.StacksAndQueues;

import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-17 23:23
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_21<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private int N = 0;

    public static void main(String[] args) {
        Ex_1_3_21<String> ex1321 = new Ex_1_3_21<>();
        ex1321.enqueue("a");
        ex1321.enqueue("b");
        ex1321.enqueue("c");
        System.out.println(find(ex1321, "c"));
    }

    public static <T> boolean find(Ex_1_3_21<T> queue, String key) {
        Iterator<T> iterator = queue.iterator();
        boolean f = false;
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (key.equals(next)) {
                f = true;
                break;
            }
        }
        return f;
    }

    public void enqueue(T t) {
        if (N == 0) {
            last = new Node<>();
            last.v = t;
            last.next = null;
            first = last;
        } else {
            Node oldLast = last;
            last = new Node<>();
            last.v = t;
            oldLast.next = last;
        }
        N++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ExIterator();
    }

    private class Node<T> {
        private T v;
        private Node<T> next;
    }

    private class ExIterator implements Iterator<T> {
        private Node<T> f = first;

        @Override
        public boolean hasNext() {
            return f.next != null;
        }

        @Override
        public T next() {
            Node<T> next = f.next;
            T v = next.v;
            f = next;
            return v;
        }
    }
}
