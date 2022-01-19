package top.kukuli.tool;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 17 - 16:05
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

/**
 * 自定义数组的工具类
 */
public class ArrayUtil {
    /**
     * 求数组的最大值；
     */
    public double getMax(double[] arr) {
        double maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue <= arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue <= arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public float getMax(float[] arr) {
        float maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue <= arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //方法的重载！

    /**
     * 求数组的最小值；
     */
    public double getMin(double[] arr) {
        double minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public float getMin(float[] arr) {
        float minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    /**
     * 求数组的总和；
     */
    public double getSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public float getSum(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 求数组的平均值；
     */
    public double getAvg(double[] arr) {
        return getSum(arr) / arr.length;
    }

    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public float getAvg(float[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 反转数组；
     */
    public double[] reverse(double[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return arr;
    }

    public int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return arr;
    }

    public float[] reverse(float[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return arr;
    }

    /**
     * 复制数组；
     */
    public double[] copy(double[] arr) {
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public float[] copy(float[] arr) {
        float[] arr1 = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    /**
     * 数组排序；
     */
    public void sort(double[] arr) {
        double temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void sort(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void sort(float[] arr) {
        float temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 遍历数组；
     */
    public void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void print(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 查找数组指定元素；
     */
    public int getIndex(double[] arr, double dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;//返回一个复数，表示没有找到值；
    }

    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;//返回一个复数，表示没有找到值；
    }

    public int getIndex(float[] arr, float dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;//返回一个复数，表示没有找到值；
    }

    /**
     * 元素互换之数组交换
     */
    public void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void swap(float[] arr, int i, int j) {
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * 元素互换之元素交换
     */
}
