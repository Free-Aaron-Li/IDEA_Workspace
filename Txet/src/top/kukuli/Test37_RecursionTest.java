package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 01 - 24 - 19:52
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身；
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制，递归一定要向已知方向递归，否则这种递归就
 * 变成了无穷递归，类似死循环；
 */
public class Test37_RecursionTest {
    public static void main(String[] args) {
        Test37_RecursionTest test = new Test37_RecursionTest();
        System.out.println(test.getSum(100));
        System.out.println(test.f(10));
    }

    /**
     * 例一：计算1~100之间所有自然数的和；
     */
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    /**
     * 例四：已知有一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n);
     * 其中n是大于0的整数，求f(10)的值；
     */
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return f(n - 1) * 2 + f(n - 2);
        }
    }
    
}
