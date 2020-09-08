/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-08 00:10
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_17 {
    public static void main(String[] args) {
        System.out.println(mystery(3, 11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }
}
