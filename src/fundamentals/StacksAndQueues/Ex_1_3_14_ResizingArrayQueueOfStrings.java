package fundamentals.StacksAndQueues;

import java.util.Iterator;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-16 22:08
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_14_ResizingArrayQueueOfStrings<T> implements Iterable<T> {
    private T[] queue = (T[]) new Object[8];
    private int N = 0;
    private int first = 0;
    private int last = 0;

    public static void main(String[] args) {
        Ex_1_3_14_ResizingArrayQueueOfStrings<Integer> queue = new Ex_1_3_14_ResizingArrayQueueOfStrings<>();
        queue.enqueue(3);
        queue.enqueue(4);
    }

    public void enqueue(T t) {
        if (N == queue.length) {
            resize(2 * queue.length);
        }
        queue[last++] = t;
        if (last == queue.length) {
            // 循环利用, 此时last已经在queue的最后一个位置上
            last = 0;
        }
        N++;
    }

    public T dequeue() {
        T t = queue[first];
        queue[first] = null;
        N--;
        first++;
        if (first == queue.length) {
            // 循环利用, 此时first已经在queue的最后一个位置上
            first = 0;
        }
        return t;
    }

    private void resize(int length) {
        T[] copy = (T[]) new Object[length];
        for (int i = 0; i < N; i++) {
            // 取余获得first的位置
            copy[i] = queue[(first + i) % queue.length];
        }
        queue = copy;
        first = 0;
        last = N;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class QueueIterator implements Iterator<T> {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < N;
        }

        @Override
        public T next() {
            T t = queue[(i + first) % queue.length];
            i++;
            return t;
        }
    }
}
