package fundamentals.StacksAndQueues;

/**
 * <p>
 *
 * </p>
 *
 * @author Greekn
 * @version 0.1
 * @date 2020-11-16 21:12
 * @package: PACKAGE_NAME
 * @modified: Greekn
 * @description:
 * @copyright: Copyright (c) 2020
 */
public class Ex_1_3_11_EvaluatePostfix {
    public static void main(String[] args) {
        Ex_1_3_4_Stack<Integer> num = new Ex_1_3_4_Stack<>();
        String string = "12+34-56-**";
        for (int i = 0; i < string.length(); i++) {
            String s = string.substring(i, i + 1);
            try {
                Integer.valueOf(s);
                num.push(Integer.valueOf(s));
            } catch (Exception e) {
                Integer n2 = num.pop();
                Integer n1 = num.pop();
                switch (s) {
                    case "+":
                        num.push(n1 + n2);
                        break;
                    case "-":
                        num.push(n1 - n2);
                        break;
                    case "*":
                        num.push(n1 * n2);
                        break;
                    case "/":
                        num.push(n1 / n2);
                        break;
                }
            }
        }
        Integer pop = num.pop();
        System.out.println(pop);
    }
}
