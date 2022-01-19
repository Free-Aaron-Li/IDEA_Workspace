package top.kukuli;

import java.util.Scanner;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 20 -19:20
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test19_BinarySearch {
    public static void main(String[] args) {
        /*二分法查找，前提要有序；
         * */
        //定义并初始化数组
        int[] arr = new int[]{1, 3, 4, 6, 8, 9, 23, 277, 3235, 45388};
        boolean isFlag = true;
        //输入值
        System.out.println("请输入要找到的值：");
        Scanner scan = new Scanner(System.in);
        int dest = scan.nextInt();
        int theHead = 0;//初始的首索引；
        int theEnd = arr.length - 1;//初始的末索引；
        while (theHead <= theEnd) {
            int theMiddle = (theHead + theEnd) / 2;
            if (dest == arr[theMiddle]) {
                System.out.println("找到了指定的元素，位置为： " + theMiddle);
                isFlag = false;
                break;
            } else if (arr[theMiddle] > dest) {
                theEnd = theMiddle - 1;
            } else {
                theHead = theMiddle + 1;
            }
        }
        if (isFlag) {
            System.out.println("抱歉，没有找到哦！");
        }
    }
}
