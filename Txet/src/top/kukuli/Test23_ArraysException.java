package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 24 -18:59
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test23_ArraysException {
    public static void main(String[] args) {
        //1.数组角标越界异常ArraysIndexOutOfBoundsException；
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //情况一：
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //情况二：
//        System.out.println(arr[-2]);
        //2.数组空指针异常NullPointerException;
        int[] arr1 = new int[]{1, 2, 3, 4};
        //情况一：
//        arr1 = null;
//        System.out.println(arr1[0]);
        //情况二：
        int[][] arr2 = new int[4][];
//        System.out.println(arr2[0][0]);
        //情况三：
        String[] arr3 = new String[]{"AA", "BB", "CC"};
//        arr3[0] = null;
//        System.out.println(arr3[0].toString());
    }
}
