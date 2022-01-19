package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 11 -20:09
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test12_Perfect_Number {
    public static void main(String[] args) {
        int i = 1, x = 1;
        System.out.println("1000以内的完数有：");
        for (i = 1; i <= 1000; i++) {
            int sum = 0;
            for (x = 1; x <= i / 2; x++) {
                if (i % x == 0 && i != x) {
                    sum = sum + x;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
