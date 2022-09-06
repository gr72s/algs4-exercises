package fundamentals.ProgrammingModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-07 23:26
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        List<List<Object>> list = new ArrayList<>();
        boolean con = true;
        int column = 0;
        int i = 1;
        while (con) {
            System.out.println("第" + i + "次输入");
            String next = scanner.nextLine();
            if ("quit".equals(next)) {
                con = false;
            } else {
                String[] s = next.trim().split(" ");
                List<Object> temp = new ArrayList<>(Arrays.asList(s));
                list.add(temp);
                column = Math.max(temp.size(), column);
                i++;
            }
        }
        // column num
        for (int j = 0; j < column; j++) {
            // row
            for (int k = 0; k < list.size(); k++) {
                System.out.print(list.get(k).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
