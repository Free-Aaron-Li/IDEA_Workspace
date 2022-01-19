package top.kukuli;

import com.kukuli.test.Circle;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 10:59
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test28_CircleTest {
    public static void main(String[] args) {
        //创建对象
        Circle c1 = new Circle();
        c1.radius = 2;
        System.out.println("Circle area is " + c1.findArea());
    }
}
