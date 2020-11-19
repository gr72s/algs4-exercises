package fundamentals.StacksAndQueues;

/**
 * <p>
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-19 21:30
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_39_RingBuffer {
    private int[] arrays = new int[3];
    private int N = 0;
    private int first;
    private int last;

    public static void main(String[] args) {
        Ex_1_3_39_RingBuffer ex1339 = new Ex_1_3_39_RingBuffer();
        ex1339.enqueue(9);
        ex1339.enqueue(10);
        ex1339.enqueue(78);
        ex1339.dequeue();
        ex1339.dequeue();
        ex1339.enqueue(34);
        ex1339.enqueue(3);
    }

    private void resize(int length) {

    }

    public void enqueue(int value) {
        if (N == arrays.length) {
            resize(2 * arrays.length);
        }
        arrays[last++] = value;
        if (last == arrays.length) {
            last = 0;
        }
        N++;
    }

    public void dequeue() {
        int array = arrays[first];
        arrays[first] = -1;
        first++;
        if (first == arrays.length) {
            first = 0;
        }
        N--;
    }

}
