package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 24 -12:57
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test20_BubbleSort {
    public static void main(String[] args) {
        /*冒泡排序
         * */
        int[] arr = new int[]{23, 34, 536, 14, -12, 3, 322, 3, -45, -6, -7, 4, 4335, -343};
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
}
