package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 0:32
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_28 {
    private int N = 0;
    private Node first;
    private Node last;

    public static void main(String[] args) {
        Ex_1_3_28 ex1328 = new Ex_1_3_28();
        ex1328.enqueue(3);
        ex1328.enqueue(4);
        ex1328.enqueue(10);
        ex1328.enqueue(8);
        System.out.println(ex1328.max());
    }

    public int max() {
        if (N == 0) return 0;
        Node f = this.first;
        Node next = f.next;
        int m = f.v;
        if (next != null) {
            m = m(next, f.v);
        }
        return m;
    }

    private int m(Node n, Integer i) {
        i = Math.max(n.v, i);
        if (n.next != null) {
            i = m(n.next, i);
        }
        return i;
    }

    public void enqueue(int t) {
        if (N == 0) {
            last = new Node();
            last.v = t;
            last.next = null;
            first = last;
        } else {
            Node oldLast = last;
            last = new Node();
            last.v = t;
            oldLast.next = last;
        }
        N++;
    }

    public class Node {
        private int v;
        private Node next;
    }
}
