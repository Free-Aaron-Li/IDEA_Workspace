package com.kukuli.test;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 18:56
 * @project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class RectangleArea {
    int m;
    int n;
    int sum = 0;

    public void method() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public int method1() {
        method();
        sum = 8 * 10;
        return sum;
    }

    public int method2(int m, int n) {
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        return n * m;
    }
}
