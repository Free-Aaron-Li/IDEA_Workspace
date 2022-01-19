package top.kukuli;
/*
 * @Author: Aaron.Li
 * @Date: 2022 - 01 - 18 - 23:14
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

/**
 * 研究方法参数的值传递机制
 * 1.关于变量的赋值：
 * 1.1 如果变量是基本数据类型，此时赋值的是变量所保存的数据值；
 * 1.2 如果变量是引用数据类型，此时赋值的是变量所保存的数据地址值；
 * 2.关于形参的传递机制，值传递；
 * 2.1 形参：方法定义时，声明的小括号内的参数
 * 2.2 实参：方法调用时，实际传递的形参的值
 */
public class Test35_ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("******************基本数据类型******************");
        int m = 10;
        int n = m;
        System.out.println("m=" + m + " n=" + n);
        n = 20;
        System.out.println("m=" + m + " n=" + n);
        System.out.println("**********************************************");
        System.out.println("******************引用数据类型******************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println("o1.orderId=" + o1.orderId + ",o2.orderId=" + o2.orderId);
        o2.orderId = 1002;
        System.out.println("o1.orderId=" + o1.orderId + ",o2.orderId=" + o2.orderId);
        System.out.println("******************参数传递机制*******************");
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + ", y = " + y);
        //交换两个变量的值操作；
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}

class Order {
    int orderId;
}

