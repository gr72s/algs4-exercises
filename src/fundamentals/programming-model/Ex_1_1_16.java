/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-08 00:02
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_16 {
    public static void main(String[] args) {
        System.out.println(exR2(6));
    }

    public static String exR2(int n) {
        if (n <= 0) {
            return "";
        }
        return exR2(n - 3) + n + exR2(n - 2) + n;
    }
}
