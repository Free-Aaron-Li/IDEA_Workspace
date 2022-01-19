package com.kukuli.test;

import java.util.Arrays;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 11:22
 * @project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Customer {
    //属性；
    String name;
    int age;
    boolean isMale;

    //方法；
    public void eat() {
        System.out.println("客户吃饭");

    }

    /*
     *睡觉时间区间为：6~24；
     * */
    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        if (age > 18) {//可以调用当前类中的属性或方法；
            return name;
        } else {
            return "Tom";
        }
    }

    public String getNation(String nation) {
        String info = "我的国籍是：" + nation;
        return info;
    }

    public int hell(int[] arr, int key) {
        Arrays.sort(arr);
        int arr1 = Arrays.binarySearch(arr, key);
        if (arr1 >= 0) {
            return arr1;
        } else {
            return -1;
        }
    }
}
/*
* import java.util.Arrays;

/**
 * @ Author:Qiutong
 * @ Date: 2020/7/30
 * @ Description:
 *//*
public class Quik {
    *//**
 * 分区过程
 * a[] 待分区数组
 * left 待分区数组最小下标
 * right 待分区数组最大下标
 *//*
    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int temp = qSort(a, left, right);
            quickSort(a, left, temp - 1);
            quickSort(a, temp + 1, right);
        }
    }

    *//*
 * 排序过程
 *  a 待排序数组
 *  left 待排序数组最小下标
 *  right 待排序数组最大下标
 * @return 排好序之后基准数的位置下标，方便下次的分区
 *//*
    public static int qSort(int[] a,int left,int right) {
        int temp=a[left];//定义基准数，默认为数组的第一个元素
        while(left<right) {//循环执行的条件
            //因为默认的基准数是在最左边，所以首先从右边开始比较进入while循环的判断条件
            //如果当前arr[right]比基准数大，则直接将右指针左移一位，当然还要保证left<right
            while(left<right && a[right]>temp) {
                right--;
            }
            //跳出循环说明当前的arr[right]比基准数要小，那么直接将当前数移动到基准数所在的位置，并且左指针向右移一位（left++）
            //这时当前数（arr[right]）所在的位置空出，需要从左边找一个比基准数大的数来填充。
            if(left<right) {
                a[left++]=a[right];
            }
            //下面的步骤是为了在左边找到比基准数大的数填充到right的位置。
            //因为现在需要填充的位置在右边，所以左边的指针移动，如果arr[left]小于或者等于基准数，则直接将左指针右移一位
            while(left<right && a[left]<=temp) {
                left++;
            }
            //跳出上一个循环说明当前的arr[left]的值大于基准数，需要将该值填充到右边空出的位置，然后当前位置空出。
            if(left<right) {
                a[right--]=a[left];
            }
        }
        //当循环结束说明左指针和右指针已经相遇。并且相遇的位置是一个空出的位置，
        //这时候将基准数填入该位置，并返回该位置的下标，为分区做准备。
        a[left]=temp;
        return left;
    }
    public static void main(String[] args) {
        int[] a= {72,6,57,88,60,42,83,73,48,85};
        quickSort(a,0,9);
        System.out.println(Arrays.toString(a));
    }
}*/
