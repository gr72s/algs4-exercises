package fundamentals.ProgrammingModel;

import edu.princeton.cs.algs4.StdIn;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-30 20:56
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_9 {
    public static void main(String[] args) {
        String s = "";
        int i = StdIn.readInt();
        for (int j = i; j > 0; j /= 2) {
            s = (j % 2) + s;
        }
        System.out.println(s);
    }
}
