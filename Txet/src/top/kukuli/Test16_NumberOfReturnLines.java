package top.kukuli;

/*
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 20 -12:38
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

import java.util.Scanner;

public class Test16_NumberOfReturnLines {
    public static void main(String[] args) {
        //方法一：
        System.out.println("方法一：");
//		这部分主要是让用户输入一个整数（维度）
        System.out.println("请输入你的维度：");
        Scanner scan = new Scanner(System.in);
        int dimension = scan.nextInt();

//		这部分是定义一个二维数组
        int[][] array = new int[dimension][dimension];

//		调用递归函数
        HuiXin(array, 0, dimension, 1);

//		打印相应的矩阵到屏幕上
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //方法二：
        System.out.println("方法二：");
        System.out.println("输入打印回行数的阶数：");
        int order = scan.nextInt();
        //声明并初始化数组
        int[][] arr = new int[order][order];
        int count = 1;//要显示的数据；
        int maxX = order - 1;//x轴的最大索引；
        int maxY = order - 1;//y轴的最大索引；
        int minX = 0;//x轴的最小索引；
        int minY = 0;//y轴的最小索引；
        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = count++;
            }
            minY++;
            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = count++;
            }
            maxX--;
            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = count++;
            }
            maxY--;
            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = count++;
            }
            minX++;
        }
        for (int i = 0; i < order; i++) {
            for (int i1 = 0; i1 < order; i1++) {
                System.out.print(arr[i][i1] + "\t");
            }
            System.out.println();
        }
    }

    //	递归函数（以下解释以三维的矩阵为例）其中参数解释如下：
//	array:二维数组
//	x:表示每个圈的起始横纵下标
//	Weidu：表示每个圈的大小
//	number：每个圈起始的数字
    public static void HuiXin(int[][] array, int x, int Weidu, int number) {

        if ((Weidu - 2) >= 0) {

//			此循环是为了赋值   1，2（行下标不变，列下标变化）
            for (int i = 0; i < Weidu - 1; i++) {
                array[x][x + i] = number++;
            }

//			此循环是为了赋值   3，4（行下标变化，列下标不变）
            for (int i = 0; i < Weidu - 1; i++) {
                array[x + i][x + Weidu - 1] = number++;
            }

//			此循环是为了赋值   5，6（行下标不变，列下标变化）
            for (int i = Weidu - 1; i > 0; i--) {
                array[x + Weidu - 1][x + i] = number++;
            }

//			此循环是为了赋值   7，8（行下标变化，列下标不变）
            for (int i = Weidu - 1; i > 0; i--) {
                array[x + i][x] = number++;
            }

            HuiXin(array, x + 1, Weidu - 2, number);
        } else if ((Weidu - 1) == 0) {
            array[x][x] = number++;
            HuiXin(array, x + 1, Weidu - 2, number);
        } else {
            return;
        }
    }
}

