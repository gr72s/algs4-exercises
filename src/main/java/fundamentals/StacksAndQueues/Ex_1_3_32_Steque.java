package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 22:02
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_32_Steque {

    private Node first;
    private Node last;
    private int N = 0;

    public Ex_1_3_32_Steque() {
        first = new Node();
        last = first;
    }

    public static void main(String[] args) {

    }

    public void push(int value) {
        if (N == 0) {
            first = new Node();
            first.v = value;
            first.next = last;
        } else {
            Node old = first;
            first = new Node();
            first.v = value;
            first.next = old;
        }
        N++;
    }

    public int pop() {
        if (N == 0) return -1;
        Node node = this.first;
        first = first.next;
        N--;
        return node.v;
    }

    public void enqueue(int value) {
        if (N == 0) {
            last = new Node();
            last.v = value;
        } else {
            Node old = this.last;
            last = new Node();
            last.v = value;
            old.next = last;
        }
        N++;
    }

    public class Node {
        private int v;
        private Node next;
    }
}
