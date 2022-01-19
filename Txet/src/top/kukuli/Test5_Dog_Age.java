package top.kukuli;

import java.util.Scanner;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 06 -13:53
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */

public class Test5_Dog_Age {
    public static void main(String[] ages) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的狗的年龄：");
        int dogAge = scan.nextInt();
        if (dogAge > 0 && dogAge <= 2) {
            System.out.println("相当于人的：" + dogAge * 10.5);
        } else if (dogAge > 2) {
            System.out.println("相当于人的：" + (dogAge * 4 + 21));
        } else {
            System.out.println("狗子还没有出生勒！");
        }
    }
}
