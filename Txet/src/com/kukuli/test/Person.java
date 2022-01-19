package com.kukuli.test;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 11:23
 * @project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Person {
    //属性；
    public String name;
    public int age = 1;
    public boolean isMale;

    //方法；
    public void eat() {
        String food = "烙饼";//形参；
        System.out.println("人可以吃饭");
        System.out.println("北方人喜欢吃：" + food);
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {//形参，也属于局部变量；
        System.out.println("人可以说话，使用的语言是：" + language);
    }

}
