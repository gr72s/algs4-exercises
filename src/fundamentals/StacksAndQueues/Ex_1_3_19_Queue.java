package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-17 20:42
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_19_Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int N = 0;

    public static void main(String[] args) {
        Ex_1_3_19_Queue<Integer> queue = new Ex_1_3_19_Queue<>();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        Integer dequeue1 = queue.dequeue();
        System.out.println(dequeue1);
        Integer dequeue2 = queue.dequeue();
        System.out.println(dequeue2);
        Integer dequeue3 = queue.dequeue();
        System.out.println(dequeue3);
        Integer dequeue4 = queue.dequeue();
        System.out.println(dequeue4);
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

    public T dequeue() {
        if (N == 1) {
            T v = last.v;
            first = last = null;
            N--;
            return v;
        }
        Node<T> f = first;
        Node<T> i = first.next;
        T a = null;
        for (; i != null; i = i.next, f = f.next) {
            if (i.next == null) {
                last = f;
                a = last.next.v;
                last.next = null;
                N--;
            }
        }
        return a;
    }

    private class Node<T> {
        private T v;
        private Node<T> next;
    }
}
