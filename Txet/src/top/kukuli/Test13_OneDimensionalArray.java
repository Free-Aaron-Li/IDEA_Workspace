package top.kukuli;

import java.util.Scanner;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 18 -15:54
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

public class Test13_OneDimensionalArray {
    public static void main(String[] args) {
      /*  //声明
        //静态初始化：数组的初始化和数组元素的赋值操作同时进行；
        int[] ids;
        ids = new int[]{1, 2, 3, 4, 5};
        //动态初始化：数组的初始化和数组元素的赋值操作分开进行；
        String[] names = new String[5];
        names[0] = "王凶獒";
        names[1] = "号";
        System.out.println(names[0]);
        for (String name : names) {
            System.out.println(name);
        }
        char[] value = new char[2];
        System.out.println(value[0] + "0");*/
        /*键入成绩，算等级；
         * */
        //1.使用Scanner，读取学生人数；
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int numbers = scan.nextInt();
        System.out.println("请输入" + numbers + "名学生的成绩：");
        //2.创建数组，存储学生成绩；动态初始化；
        int[] num = new int[numbers];
        //3.给数组中的元素赋值
        int maxScore = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            //4.获取数组中的元素的最大值：最高分；
            if (i >= maxScore) {
                maxScore = i;
            }
        }
        System.out.println("The max score is " + maxScore + ".");
        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩；
        char level;
        for (int h = 0; h < num.length; h++) {
            if (maxScore - num[h] <= 10) {
                level = 'A';
            } else if (maxScore - num[h] <= 20) {
                level = 'B';
            } else if (maxScore - num[h] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student" + h + "score is " + num[h] + ", " + "grade is " + level + ".");
        }
    }
}
