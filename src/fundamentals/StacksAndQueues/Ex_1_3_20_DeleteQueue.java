package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-17 21:20
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_20_DeleteQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int N = 0;

    public static void main(String[] args) {
        Ex_1_3_20_DeleteQueue<Integer> queue = new Ex_1_3_20_DeleteQueue<>();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.delete(4);
    }

    public void delete(int index) {
        if (index == 1) {
            first = first.next;
            return;
        }
        Node f = first;
        while (f != null && --index != 0) {
            f = f.next;
        }
        if (index != 0 || f == null || f.next == null) {
            return;
        } else {
            f.next = f.next.next;
        }
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

    private class Node<T> {
        private T v;
        private Node<T> next;
    }
}
