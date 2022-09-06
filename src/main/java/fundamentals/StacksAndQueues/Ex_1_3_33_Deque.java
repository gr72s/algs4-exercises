package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 22:19
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_33_Deque<T> {
    private DoubleNode<T> first;
    private DoubleNode<T> last;
    private int N = 0;

    public static void main(String[] args) {
        Ex_1_3_33_Deque<Integer> deque = new Ex_1_3_33_Deque<>();
        deque.pushLeft(3);
        deque.pushLeft(4);

    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void pushLeft(T t) {
        DoubleNode<T> doubleNode = new DoubleNode<>();
        doubleNode.v = t;
        if (isEmpty()) {
            first = last = doubleNode;
        } else {
            first.previous = doubleNode;
            doubleNode.next = first;
            first = doubleNode;
        }
        N++;
    }

    public void pushRight(T t) {
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.v = t;
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        N++;
    }

    public T popLeft() {
        if (isEmpty()) return null;
        T v = first.v;
        first = first.next;
        first.previous = null;
        return v;
    }

    public T popRight() {
        if (isEmpty()) return null;
        T v = last.v;
        last = last.previous;
        last.next = null;
        return v;
    }

    public class DoubleNode<T> {
        private T v;
        private DoubleNode<T> previous;
        private DoubleNode<T> next;
    }
}
