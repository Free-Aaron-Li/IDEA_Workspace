package com.kukuli.test;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 11:21
 * @project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class NewPerson {
    public String name;
    public int age;
    /**
     * sex:1表明是男性
     * sex:0表明是女性
     */
    public int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age" + age);
    }

    public int addAge(int i) {//形参不能赋值；
        age += i;
        return age;
    }
}
