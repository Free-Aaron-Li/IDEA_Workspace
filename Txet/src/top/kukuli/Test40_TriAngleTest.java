package top.kukuli;

/*
 * @author: Aaron.Li
 * @data: 2022 - 02 - 02 - 下午1:13
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * construct:建设、建造。
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的信息
 *
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名（形参列表）{}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器
 */
public class Test40_TriAngleTest {
    public static void main(String[] args) {
        Test40_TriAngle test=new Test40_TriAngle();
        test.setBase(10);
        test.setHeight(234);
        System.out.println("base: "+test.getBase()+",height: "+test.getHeight());
        Test40_TriAngle testOne=new Test40_TriAngle(13,23);
        System.out.println("base: "+testOne.getBase()+",height: "+testOne.getHeight());
    }
}
