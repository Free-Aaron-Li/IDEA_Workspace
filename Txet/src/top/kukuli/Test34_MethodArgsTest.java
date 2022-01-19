package top.kukuli;

/*
 * @author: Aaron.Li
 * @Date: 2022 - 01 - 18 - 17:57
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

/**
 * 可变个数形参的方法
 * <p>
 * 1.JDK5.0新增的内容
 * 提供了Varargs(variable number of arguments)机制，允许直接定义能和多个实参相匹配的形参。
 * 从而，可以用一种更简单的方式，来传递个数可变的实参。
 * 2.具体使用：
 * 2.1 可变个数形参的格式：
 * 数据类型...变量名
 * 2.2 当调用可变个数的形参方法时，传入的参数个数可以是：0个、1个……；
 * 2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载；
 * 2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载（二者之间不共存）；
 * 2.5 可变个数形参在方法的形参中，必须声明在末尾；
 * 2.6 优先执行确定形参的方法，没有再执行可变个数形参方法；
 * 2.7 可变个数形参在方法的形参中，最多只能声明一个可变形参。
 */
public class Test34_MethodArgsTest {
    public static void main(String[] args) {
        Test34_MethodArgsTest test = new Test34_MethodArgsTest();
        test.show(12);
        //test.show("hello!", "world");
        /**
         * 或者采用数组方法；
         */
        test.show1(1, "Hello", "world!");
    }

    public void show(int i) {
        System.out.println(i);
    }
    /*public void show(String s) {
        System.out.println(s);
    }*/

    public void show(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }

    /**public void show(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
     System.out.print(strs[i] + " ");
        }
    }*/
    public void show1(int i, String... strs) {
        System.out.println(i);
        for (int j = 0; j < strs.length; j++) {
            System.out.print(strs[j] + " ");
        }
    }
}
