package top.kukuli;

import com.kukuli.test.RectangleArea;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 11:41
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test29_RectangleAreaTest {
    public static void main(String[] args) {
        /**
         * ①、编写程序，声明一个method方法，在方法中打印一个10*8的矩形，在main方法中调用该方法；
         * ②、修改上一个程序，在main方法中，除打印一个10*8的矩形外，再计算该矩形的面积，并将其作为方法返回值，在main方法
         * 中调用该方法，接收面积并打印。
         * ③、修改上一个程序，在method方法中提供m和n两个参数，方法中打印m*n的矩形，并计算该矩形的面积，并将其作为方法返回
         * 值，在main方法中调用该方法，接收返回的面积值并打印。
         */
        RectangleArea a1 = new RectangleArea();
        a1.method();
        System.out.println();
        System.out.println(a1.method1());
        System.out.println(a1.method2(4, 3));
    }
}
