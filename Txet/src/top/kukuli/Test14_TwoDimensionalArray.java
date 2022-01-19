package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 18 -22:22
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test14_TwoDimensionalArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String[][] arr2 = new String[3][2];
        int[][] arr3 = new int[3][2];
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        //arr2[0] = new String[4];
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
        System.out.println(arr3);
        int[][] arr4 = new int[4][];
        System.out.println(arr4[1]);
        int[][] arr5 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr5[0][0]);
    }
}
