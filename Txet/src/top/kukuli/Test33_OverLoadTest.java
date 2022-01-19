package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 01 - 17 - 22:42
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

/**
 * 方法的重载；
 * 1.概念：
 * 在同一个类中，允许存在一个以上的同名方
 * 法，只要它们的参数个数或者参数类型不同即可；（同名不同参）
 * "两同一不同“：同一个类、相同方法名；
 * 参数列表不同，参数个数不同，参数类型不同；
 * 2.特点：
 * 与返回值类型无关，只看参数列表，且参数列表必需不同（参数个数或参数类型）。
 * 根据方法参数列表的不同来区别；
 * 3.判断是否是重构：
 * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系；
 * 4.在通过对象调用方法时，如何确定某一个指定方法；
 * 方法名--->参数列表
 * 举例：
 */
public class Test33_OverLoadTest {
    public static void main(String[] args) {
        Test33_OverLoadTest test = new Test33_OverLoadTest();
        test.getSum("hahav ", 3);
    }

    //如下四种方法构成重构；
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1, double d2) {
        System.out.println(d1 + d2);
    }

    public void getSum(String s, int i) {
        System.out.println(s + i);
    }

    public void getSum(int i, String s) {
        System.out.println(s + i);
    }
}
