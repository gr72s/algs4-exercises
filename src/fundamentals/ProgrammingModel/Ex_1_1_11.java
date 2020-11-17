package fundamentals.ProgrammingModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-08-30 21:02
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        List<List<Integer>> list = new ArrayList<>();
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
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < s.length; j++) {
                    temp.add(Integer.valueOf(s[j]));
                }
                list.add(temp);
                column = Math.max(temp.size(), column);
                i++;
            }
        }
        // 打印列号
        for (int j = 0; j <= column; j++) {
            if (j == 0) {
                System.out.print(" ");
            } else {
                System.out.print(j);
            }
            System.out.print(" ");
        }
        // 换行
        System.out.println();
        // 打印行号及符号
        for (int j = 1; j <= list.size(); j++) {
            // 打印行号
            System.out.print(j + " ");
            // 打印符号
            for (int k = 0; k < column; k++) {
                try {
                    System.out.print(list.get(j - 1).get(k) != null ? "@" : "*");
                } catch (IndexOutOfBoundsException e) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
