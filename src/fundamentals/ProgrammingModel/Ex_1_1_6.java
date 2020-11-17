package fundamentals.ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-30 20:53
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i < 25; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
