package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-16 21:01
 * @package: PACKAGE_NAME
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_10_InFixToPostFix {
    public static void main(String[] args) {
        Ex_1_3_4_Stack<String> ops = new Ex_1_3_4_Stack<>();
        Ex_1_3_4_Stack<String> num = new Ex_1_3_4_Stack<>();
        String string = "((1+2)*((3-4)*(5-6)))";
        for (int i = 0; i < string.length(); i++) {
            String s = string.substring(i, i + 1);
            if (s.equals("(")) {
                continue;
            }
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                ops.push(s);
            } else {
                if (s.equals(")")) {
                    String n1 = num.pop();
                    String n2 = num.pop();
                    num.push(n2 + n1 + ops.pop());
                } else
                    num.push(s);
            }
        }
        String pop = num.pop();
        System.out.println(pop);
    }
}
