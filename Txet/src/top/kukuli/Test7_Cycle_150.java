package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 07 -17:41
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */
public class Test7_Cycle_150 {
    public static void main(String[] args) {
        int num = 1;
        label:
        for (num = 1; num < 150; num++) {
            System.out.print(num + " ");
            if (num % 3 == 0) {
                System.out.print("foo" + " ");
            }
            if (num % 5 == 0) {
                System.out.print("biz" + " ");
                break label;
            }
            if (num % 7 == 0) {
                System.out.print("baz" + " ");
            }
            System.out.println();
        }
    }
}
