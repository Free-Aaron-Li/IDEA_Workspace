package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 20 -13:43
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test17_ArrayValue {
    public static void main(String[] args) {
        /*定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
         *然后求出所有元素的最大值、最小值、和值、平均值，并输出出来。
         * 要求：所有随机数都是两位数；
         * */
        int[] arr = new int[10];
        for (int i4 = 0; i4 < arr.length; i4++) {
            arr[i4] = (int) (Math.random() * 90 + 10);
        }
        //求数组元素的最大值；
        int maxValue = arr[0];
        for (int i3 = 1; i3 < arr.length; i3++) {
            if (maxValue < arr[i3]) {
                maxValue = arr[i3];
            }
        }
        //遍历数组；
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //求数组元素的最小值；
        int minValue = arr[0];
        for (int i2 = 1; i2 < arr.length; i2++) {
            if (minValue > arr[i2]) {
                minValue = arr[i2];
            }
        }
        //求数组元素的和值；
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //求数组元素的平均值；
        int avgValue = sum / arr.length;
        //遍历数组；
        System.out.print("该数组元素为：");
        System.out.println();
        System.out.println("最大值为： " + maxValue);
        System.out.println("最小值为： " + minValue);
        System.out.println("和值为： " + sum);
        System.out.println("平均值为： " + avgValue);
    }
}
