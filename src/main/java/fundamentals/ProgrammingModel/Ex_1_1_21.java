package fundamentals.ProgrammingModel;

import java.text.DecimalFormat;
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
 * @date 2020-09-08 00:22
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        List<List<Object>> list = new ArrayList<>();
        boolean con = true;
        int i = 1;
        int column = 0;
        // 获得输入，输入quit退出
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
        // 打印列号
        System.out.println("colums: " + column);
        for (int j = 0; j <= column + 1; j++) {
            if (j == 0) {
                System.out.print(" ");
            } else {
                System.out.print(j);
            }
            System.out.print(" ");
        }
        // 换行
        System.out.println();

        for (int j = 0; j < list.size(); j++) {
            // 打印行号
            System.out.print(j + 1 + " ");
            for (int k = 0; k <= column; k++) {
                if (k == column) {
                    Double v = Double.parseDouble((String) list.get(j).get(k - 2)) / Double.parseDouble((String) list.get(j).get(k - 1));
                    // 格式化小数点位数
                    DecimalFormat df = new DecimalFormat("#.000");
                    System.out.print(df.format(v));
                } else {
                    System.out.print(list.get(j).get(k));
                    System.out.print(" ");
                }
            }
        }
    }
}
