package fundamentals.ProgrammingModel;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.StdIn;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-30 20:20
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int temp = StdIn.readInt();
            System.out.println("input " + temp);
            list.add(temp);
        }
        Integer[] temp = new Integer[list.size()];
        Integer[] integers = list.toArray(temp);
        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.println("equal");
                break;
            }
            if (!integers[i].equals(integers[i + 1])) {
                System.out.println("not equal");
                break;
            }
        }
    }
}
