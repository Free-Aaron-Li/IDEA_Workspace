package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 19 -23:37
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test15_YangHuiTriangle {
    public static void main(String[] args) {
        /*
         *1.使用二维数组打印一个10行杨辉三角；
         * */
        //声明并初始化二维数组；
        int[][] yangHui = new int[10][];
        //给数组赋值；
        /*yangHui[0][0] = 1;
        yangHui[1][0] = 1;
        yangHui[1][1] = 1;//排列前两行；*/
        for (int num1 = 0; num1 < yangHui.length; num1++) {
            yangHui[num1] = new int[num1 + 1];
            yangHui[num1][0] = yangHui[num1][num1] = 1;
            for (int num2 = 1; num2 < yangHui[num1].length - 1; num2++) {
                yangHui[num1][num2] = yangHui[num1 - 1][num2 - 1] + yangHui[num1 - 1][num2];
                yangHui[num1][0] = 1;
                yangHui[num1][num2 + 1] = 1;
            }
        }
        //遍历数组；
        for (int i = 0; i < yangHui.length; i++) {
            for (int i1 = 0; i1 < i + 1; i1++) {
                System.out.print(yangHui[i][i1] + " ");
            }
            System.out.println();
        }
        /*
         *2.创建一个长度为6的int型数组，要求数据元素的值都在1~30之间，且是随机赋值。
         *同时，要求元素的值各不相同；
         * */
        /*
         *方法一；
         **/
        System.out.println("方法一：");
        //声明并初始化数组；
        int[] value = new int[6];
        //给数组赋值；
        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 30) + 1;//[1,31)
            for (int j = 0; j < i; j++) {
                if (value[i] == value[j]) {
                    i--;
                    break;
                }
            }
        }
        //遍历数组；
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        /*方法二；
         * */
        System.out.println("方法二：");
        //声明并初始化数组；
        int[] arr = new int[6];
        //赋值数组；
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;
            boolean flag = false;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }
        //遍历数组；
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
