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
 * @date 2020-08-30 20:45
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_5 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(StdIn.readDouble());
        }
        long count = list.stream().filter(d -> 0 < d && d < 1).count();
        if (count == 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
