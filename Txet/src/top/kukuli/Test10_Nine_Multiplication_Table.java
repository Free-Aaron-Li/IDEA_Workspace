package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 08 -19:01
 * @Description: com.msb.Test10_Nine
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test10_Nine_Multiplication_Table {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, sum = 0;
        for (num1 = 1; num1 < 10; num1++) {
            for (num2 = 1; num2 <= num1; num2++) {
                sum = num1 * num2;
                System.out.print(num2 + "*" + num1 + "=" + sum + " ");
            }
            System.out.println();
        }
    }
}
