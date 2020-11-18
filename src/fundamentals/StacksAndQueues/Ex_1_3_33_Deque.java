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
    private DoubleNode first;
    private DoubleNode last;
    private int N = 0;

    public Ex_1_3_33_Deque() {
        first = new DoubleNode();
        last = first;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void pushLeft(T t) {

    }

    public void pushRight(T t) {

    }

    public T popLeft() {
        return null;
    }

    public T popRight() {
        return null;
    }

    public class DoubleNode {
        private int v;
        private DoubleNode previous;
        private DoubleNode next;
    }
}
