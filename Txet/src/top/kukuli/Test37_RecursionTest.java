package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 01 - 24 - 19:52
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

import java.util.Scanner;

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
        System.out.println("*****************************************");
        System.out.println(test.f(10));
        System.out.println("*****************************************");
        System.out.println(test.f1(5));
        System.out.println("*****************************************");
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("汉诺塔游戏开始啦");
        System.out.println("请输入盘子数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //调用汉诺塔
        hannoi(n, A, B, C);
        s.close();
        String str = "abc";
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
     * 例二：已知有一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n);
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

    /**
     * 例三：斐波那契数列：1、1、2、3、5、8、13、21、34、55……；
     */
    public int f1(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return f1(n - 1) + f1(n - 2);
        }
    }

    /**
     * 例四：汉诺塔问题
     */
    public static void hannoi(int n, char A, char B, char C) {
        if (n == 1) {
            move(n, A, C);
        } else {

            //移动上一关的步骤移动到B
            hannoi(n - 1, A, C, B);
            //把最大的盘子移动C塔
            move(n, A, C);
            //再把B上的上一关的盘子移动到C上就可以了
            hannoi(n - 1, B, A, C);
        }
    }

    /**
     * 盘子移动
     */
    public static void move(int disk, char M, char N) {
        System.out.println("盘子" + disk + "  " + M + "------->" + N);
    }

}




