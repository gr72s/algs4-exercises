package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 1:37
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_30 {
    private Node first;
    private Node last;
    private int N = 0;

    public static void main(String[] args) {
        Node a1 = new Node();
        a1.v = 1;
        Node a2 = new Node();
        a2.v = 2;
        Node a3 = new Node();
        a3.v = 3;
        a1.next = a2;
        a2.next = a3;
        re(a1);
    }

    public static Node re(Node x) {
        Node first = x;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
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

    public static class Node {
        private int v;
        private Node next;
    }
}
