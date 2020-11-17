package fundamentals.ProgrammingModel;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-07 23:51
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_15 {
    public static void main(String[] args) {
        int[] histogram = histogram(new int[]{ 0, 1, 2, 3 }, 4);
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(histogram[i]);
        }
    }

    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            for (int value : a) {
                if (value == i) {
                    int temp = b[i] + 1;
                    b[i] = temp;
                }
            }
        }
        return b;
    }
}
