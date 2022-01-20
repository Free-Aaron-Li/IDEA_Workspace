package s0015;

import org.junit.Test;

import java.util.Arrays;

public class Three_Sum_Test {

    @Test
    public void test() {
        System.out.println(Arrays.deepEquals(new int[][]{{0, 0, 0}}, Three_Sum.three_Sum(new int[]{0, 0, 0})));
        System.out.println(Arrays.deepEquals(new int[][]{{-1, 0, 1}, {-1, -1, 2}}, Three_Sum.three_Sum(new int[]{-1, 0, 1, 2, -1, -4})));
        System.out.println(Arrays.deepEquals(new int[][]{{-4, -2, 6}, {-4, 0, 4}, {-4, 1, 3}, {-4, 2, 2}, {-2, -2, 4}, {-2, 0, 2}}, Three_Sum.three_Sum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6})));
        System.out.println(Arrays.deepEquals(new int[][]{{-10, 2, 8}, {-10, 3, 7}, {-10, 4, 6}, {-10, 5, 5}, {-8, 2, 6}, {-8, 3, 5}, {-8, 4, 4}, {-7, -1, 8},
                {-7, 2, 5}, {-7, 3, 4}, {-6, -2, 8}, {-6, -1, 7}, {-6, 2, 4}, {-5, -3, 8}, {-5, -2, 7}, {-5, -1, 6}, {-5, 2, 3},
                {-4, -3, 7}, {-4, -2, 6}, {-4, -1, 5}, {-4, 2, 2}, {-3, -3, 6}, {-3, -2, 5}, {-3, -1, 4}, {-2, -1, 3}}, Three_Sum.three_Sum(new int[]{5, -7, 3, -3, 5, -10, 4, 8, -3, -8, -3, -3, -1, -8, 6, 4, -4, 7, 2, -5, -2, -7, -3, 7, 2, 4, -6, 5})));
    }

}
