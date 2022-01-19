package top.kukuli;

import java.util.Scanner;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 06 -19:20
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */

public class Test6_Tall_Rich_And_Handsome {
    public static void main(String[] args) {
        System.out.println("结婚要求：高：180cm以上；富：财富1千万以上；帅：是");
        System.out.println("其说出你满足的要求：");
        Scanner scan = new Scanner(System.in);
        System.out.println("你的身高是多少：");
        double hight = scan.nextDouble();
        System.out.println("你的财富是多少：（单位百万）");
        double value = scan.nextDouble();
        System.out.println("你的够不够帅：（true/false)");
        String handsome = scan.next();
        if (hight >= 180 && value >= 10 && handsome.equals("true")) {
            System.out.println("我一定要嫁给他！！！");
        } else if (hight >= 180 || value >= 10 || handsome.equals("true")) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁！");
        }
    }
}
