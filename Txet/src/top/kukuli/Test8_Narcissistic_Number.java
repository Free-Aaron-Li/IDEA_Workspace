package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 07 -19:21
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

public class Test8_Narcissistic_Number {
    public static void main(String[] args) {
        System.out.println("所有水仙花数：");
        int value = 0;
        int hundreds, tens, ones;
        for (value = 0; value < 1000; value++) {
            hundreds = value / 100;
            tens = value / 10 % 10;
            ones = value % 10;
            if (value == hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones) {
                System.out.println(value);
            }
        }
    }
}
