package fundamentals.ProgrammingModel;

/**
 * <p>
 *
 * </p>
 *
 * @author cheer
 * @version 0.1
 * @date 2020-09-10 20:41
 * @package: PACKAGE_NAME
 * @modified: cheer
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_1_24 {

    public static void main(String[] args) {
        System.out.println(gcd(24, 105));
    }

    public static int gcd(int p, int q) {
        if (p == 0 || q == 0) {
            return p == 0 ? q : p;
        }
        int r = p > q ? p % q : q % p;
        System.out.println("p=" + p + "q=" + q);
        return gcd(q, r);
    }
}
