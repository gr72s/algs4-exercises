package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-17 23:42
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_24<T> {
    public int N = 0;
    private Node<T> first;
    private Node<T> last;

    public static void main(String[] args) {
        Ex_1_3_24<String> ex1324 = new Ex_1_3_24<>();
        ex1324.enqueue("a");
        ex1324.enqueue("b");
        ex1324.enqueue("c");
        Node<String> node = new Node<>();
        node.v = "b";
        ex1324.removeAfter(node);
        System.out.println(ex1324.N);
    }

    public void removeAfter(Node<T> node) {
        if (node == null || node.next == null)
            return;
        Node<T> current = node.next;
        Node<T> next = current.next;
        node.next = null;
        while (current.next != null) {
            current = null;
            current = next;
            next = next.next;
        }
    }

    public Node<T> search(T t)
    {
        Node<T> current = first;
        while (current != null)
        {
            if (t.equals(current.v))
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    private void d(Node f) {
        Node c = null;
        while (f.next != null) {
            Node f1 = f;
            f = f.next;
            c = f1;
        }
        c.next = null;
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

    public static class Node<T> {
        private T v;
        private Node<T> next;
    }
}
