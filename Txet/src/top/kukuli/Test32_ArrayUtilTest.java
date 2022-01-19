package top.kukuli;

import top.kukuli.tool.ArrayUtil;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 17 - 16:15
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test32_ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil test = new ArrayUtil();
        int[] arr = new int[]{32, 523, 33, 454, 344, 34, 44, 242, 3453, 47, 5,};
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("最大值为：" + test.getMax(arr1));
        System.out.println("*******************************************");
        System.out.println("最小值为：" + test.getMin(arr1));
        System.out.println("*******************************************");
        System.out.println("综合为：" + test.getSum(arr1));
        System.out.println("*******************************************");
        System.out.println("平均值为：" + test.getAvg(arr1));
        System.out.println("*******************************************");
        System.out.println("反转数组");
        test.print(test.reverse(arr1));
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("复制数组");
        test.print(test.copy(arr1));
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("数组排序");
        test.sort(arr1);
        test.print(arr1);
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("查找数组指定元素");
        System.out.println(test.getIndex(arr1, 3));
        System.out.println("*******************************************");
        System.out.println(new ArrayUtil().getIndex(arr1, 3));
    }
}
