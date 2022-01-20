package s0001;

/**
 * @author KK
 * @create 2021/11/12 20:41
 */
public class Two_Sum {
    /**
     * 在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。
     *
     * @param numbers 待查找的数组
     * @param target  目标值
     * @return 返回数组下标的位置，如果没有找到则返回null
     * 找到返回例："[2,3]"
     * 未找到返回例： return null
     */                                                                   //这是我的源代码
    public static String two_Sum(int[] numbers, int target) {
        int a = numbers.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return "[" + i + "," + j + "]";
                }//寻找最优解；
            }
        }
        return null;
    }
}
