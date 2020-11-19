package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-19 13:11
 * @package fundamentals.StacksAndQueues
 * @modified Greekn
 * @description
 */
public class Ex_1_3_33_ResizingArrayQueue<T> {
    private T[] arrays = (T[]) new Object[10];
    private int N = 0;
    private int first;
    private int last;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int length) {
        T[] ts = (T[]) new Object[length];
        for (int i = 0; i < N; i++) {
            // 取模
            ts[i] = arrays[(first + i) % arrays.length];
        }
        arrays = ts;
        first = 0;
        last = N;
    }

    public void pushLeft(T t) {
        T[] copy = (T[]) new Object[arrays.length + 1];
        System.arraycopy(arrays, 0, copy, 1, arrays.length);
        copy[0] = t;
        arrays = copy;
        N++;
    }

    public void pushRight(T t) {
        if (N == arrays.length) {
            resize(2 * arrays.length);
        }
        arrays[last++] = t;
        N++;
    }

    public T popLeft(T t) {
        T array = arrays[0];
        T[] copy = (T[]) new Object[arrays.length];
        System.arraycopy(arrays, 1, copy, 0, arrays.length - 1);
        arrays = copy;
        N--;
        return array;
    }

    public T popRight(T t) {
        T array = arrays[--last];
        arrays[last] = null;
        return array;
    }
}
