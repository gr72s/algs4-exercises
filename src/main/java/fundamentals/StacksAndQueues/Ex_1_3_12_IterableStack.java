package fundamentals.StacksAndQueues;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-16 21:41
 * @package: fundamentals.StacksAndQueues
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_12_IterableStack<T> implements Iterable<T> {
    private T[] arrays = (T[]) new Object[100];
    private int N = 0;

    public static void main(String[] args) {
        Ex_1_3_12_IterableStack<String> strings = new Ex_1_3_12_IterableStack<>();
        strings.push("s");
        strings.push("a");
        strings.push("r");
        Ex_1_3_12_IterableStack<String> copy = copy(strings);
        System.out.println(copy == strings);
    }

    public static <T> Ex_1_3_12_IterableStack<T> copy(Ex_1_3_12_IterableStack<T> stack) {
        Iterator<T> iterator = stack.iterator();
        Ex_1_3_12_IterableStack<T> copyStack = new Ex_1_3_12_IterableStack<>();
        while (iterator.hasNext()) {
            copyStack.push(iterator.next());
        }
        return copyStack;
    }

    public void push(T t) {
        arrays[N++] = t;
    }

    public T pop() {
        return arrays[--N];
    }

    @Override
    public Iterator<T> iterator() {
        return new IterableStackIterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex_1_3_12_IterableStack<?> that = (Ex_1_3_12_IterableStack<?>) o;
        return N == that.N &&
                Arrays.equals(arrays, that.arrays);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(N);
        result = 31 * result + Arrays.hashCode(arrays);
        return result;
    }

    private class IterableStackIterator implements Iterator<T> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return arrays[--i];
        }
    }
}
