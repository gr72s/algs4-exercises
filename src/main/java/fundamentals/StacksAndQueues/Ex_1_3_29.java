package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 0:49
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_29 {
    private Node last;

    public static void main(String[] args) {
        Ex_1_3_29 ex_1_3_29 = new Ex_1_3_29();
        ex_1_3_29.enqueue(3);
        ex_1_3_29.enqueue(4);
        ex_1_3_29.enqueue(5);
    }

    public void enqueue(int t) {
        Node node = new Node();
        if (last == null) {
            last = new Node();
            last = node;
            node.next = node;
        } else {
            node.next = last.next;
            last.next = node;
            last = node;
        }
    }

    public class Node {
        private int v;
        private Node next;
    }
}
