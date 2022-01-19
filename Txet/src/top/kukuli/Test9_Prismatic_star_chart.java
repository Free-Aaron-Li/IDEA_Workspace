package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 08 -17:04
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test9_Prismatic_star_chart {
    public static void main(String[] args) {
        int num = 0;
        int value1 = 0;
        int value2 = 0;
        for (num = 4; num >= 0; num--) {
            while (value1 + 1 <= num) {
                System.out.print(" ");
                value1++;
            }
            while (value2 + 1 <= 5 - num) {
                System.out.print("*" + " ");
                value2++;
            }
            value1 = value2 = 0;
            System.out.println();
        }
        int value3 = 1;
        int value4 = 1;
        int row = 1;
        for (row = 1; row <= 4; row++) {
            while (value3 <= row) {
                System.out.print(" ");
                value3++;
            }
            while (value4 <= 5 - row) {
                System.out.print("*" + " ");
                value4++;
            }
            value3 = value4 = 1;
            System.out.println();
        }
    }
}
