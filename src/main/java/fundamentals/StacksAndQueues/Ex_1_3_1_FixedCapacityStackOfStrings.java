package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-15 23:21
 * @package PACKAGE_NAME
 * @modified Greekn
 * @description
 */
public class Ex_1_3_1_FixedCapacityStackOfStrings {
    private String[] strings;
    private int N;

    public Ex_1_3_1_FixedCapacityStackOfStrings(int cap) {
        strings = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String s) {
        strings[N++] = s;
    }

    public String pop() {
        return strings[--N];
    }

    public boolean isFull() {
        return N == strings.length;
    }
}
