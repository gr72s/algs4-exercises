package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-18 1:11
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_31 {

    private DoubleNode first;
    private DoubleNode last;
    private int N = 0;

    public Ex_1_3_31() {
        first = new DoubleNode();
        last = first;
    }

    public static void main(String[] args) {
        Ex_1_3_31 ex1331 = new Ex_1_3_31();
        ex1331.tailAdd(8);
        ex1331.headAdd(3);
        ex1331.headAdd(4);
        ex1331.tailAdd(9);
        ex1331.headDelete();
        DoubleNode node = ex1331.search(3);
        ex1331.insertBeforeNode(node, 99);
        ex1331.insertBeforeNode(node, 80);
    }

    public void headAdd(int value) {
        if (N == 0) {
            first.v = value;
        } else {
            DoubleNode old = this.first;
            first = new DoubleNode();
            first.v = value;
            first.next = old;
            old.previous = first;
        }
        N++;
    }

    public void tailAdd(int value) {
        if (N == 0) {
            last.v = value;
        } else {
            DoubleNode old = this.last;
            last = new DoubleNode();
            last.v = value;
            old.next = last;
            last.previous = old;
        }
        N++;
    }

    public void headDelete() {
        if (N == 0) return;
        DoubleNode old = first.next;
        old.previous = null;
        first = old;
        N--;
    }

    public void tailDelete() {
        if (N == 0) return;
        DoubleNode previous = last.previous;
        previous.next = null;
        last = previous;
        N--;
    }

    public void insertBeforeNode(DoubleNode node, int nValue) {
        if (node.previous == null) {
            headAdd(nValue);
        } else {
            DoubleNode newNode = new DoubleNode();
            newNode.v = nValue;
            DoubleNode previous = node.previous;
            previous.next = newNode;
            newNode.previous = previous;
            node.previous = newNode;
            newNode.next = node;
        }
        N++;
    }

    public void insertAfterNode(DoubleNode node, int nValue) {
        if (node.next == null) {
            tailAdd(nValue);
        } else {
            DoubleNode newNode = new DoubleNode();
            newNode.v = nValue;
            DoubleNode previous = node.previous;
            previous.next = newNode;
            node.previous = newNode;
            newNode.previous = previous;
            newNode.next = node;
        }
        N++;
    }

    public void delete(DoubleNode node) {
        if (node.previous == null) {
            headDelete();
        } else if (node.next == null) {
            tailDelete();
        } else {
            DoubleNode previous = node.previous;
            DoubleNode next = node.next;
            previous.next = next;
            next.previous = previous;
        }
    }

    public DoubleNode search(int value) {
        DoubleNode n = null;
        do {
            if (first.v == value) {
                n = first;
                break;
            }
        } while (first.next != null);
        return n;
    }

    public class DoubleNode {
        private int v;
        private DoubleNode previous;
        private DoubleNode next;
    }
}
