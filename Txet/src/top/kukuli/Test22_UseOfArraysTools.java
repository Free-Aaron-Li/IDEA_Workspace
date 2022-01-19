package top.kukuli;

import java.util.Arrays;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 24 -18:27
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test22_UseOfArraysTools {
    public static void main(String[] args) {
        /*使用几个常用的Arrays工具类；
         * */
        //定义和初始化数组；
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4};
        int[] arr = new int[]{23, 34, 536, 14, -12, 3, 322, 3, -45, -6, -7, 4, 4335, -343};
        //boolean equals(int[] a,int[] b) ：判断两个数组是否相等；
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);
        //String toString(int[] a) ：输出数组信息；
        System.out.println(Arrays.toString(arr1));
        //void sort(int[] a) ：对数组进行排序；
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //void fill(int[] a,int val) ：将指定值填充到数组中；
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));
        //int binarySearch(int[] a,int key) ：对排序后的数组进行二分法查找；
        int index = Arrays.binarySearch(arr2, 4);
        System.out.println(index);
    }
}
