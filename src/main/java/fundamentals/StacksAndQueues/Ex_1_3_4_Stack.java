package fundamentals.StacksAndQueues;

import edu.princeton.cs.algs4.StdIn;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 23:39
 * @package PACKAGE_NAME
 * @modified Greekn
 * @description
 */
public class Ex_1_3_4_Stack<T> {
    public static void main(String[] args) {
        Ex_1_3_4_Stack<Character> stack = new Ex_1_3_4_Stack<>();
        String s = StdIn.readString();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '[':
                case '(':
                case '{':
                    stack.push(ch);
                    break;
                case ']':
                case ')':
                case '}':
                    stack.pop();
                    break;
            }
        }
        System.out.println(stack.isEmpty());
    }

    private T[] arrays = (T[]) new Object[100];
    private int N = 0;

    private void resize(int cap) {
        T[] newObj = (T[]) new Object[cap];
        for (int i = 0; i < N; i++) {
            newObj[i] = arrays[i];
        }
        arrays = newObj;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T t) {
        if (N == arrays.length) {
            resize(2 * arrays.length);
        }
        arrays[N++] = t;
    }

    public T pop() {
        T t = arrays[--N];
        arrays[N] = null;
        if (N > 0 && N < arrays.length / 4) {
            resize(arrays.length / 2);
        }
        return t;
    }

}
