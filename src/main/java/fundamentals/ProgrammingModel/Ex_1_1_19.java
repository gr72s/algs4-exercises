package fundamentals.ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-08 00:15
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_19 {
    public static void main(String[] args) {
        long[] t = new long[30];
        for (int i = 0; i < 30; i++) {
            t[i] = F(i);
        }
        for (int i = 0; i < t.length; i++) {
            StdOut.println(i + " " + t[i]);
        }
    }

    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }
}
