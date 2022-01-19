package com.kukuli.test;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 11:24
 * @project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Circle {
    //属性
    public double radius;

    //方法
    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
