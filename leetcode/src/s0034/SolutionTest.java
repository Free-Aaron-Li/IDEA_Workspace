package s0034;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName SolutionTest
 * @Description TODO
 * @Date 2021/11/16 20:02
 **/
public class SolutionTest {


    @Test
    public void test() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println("[3, 4]".equals(Arrays.toString(new Solution().searchRange(nums,target)))); //[3, 4]

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 6;
        System.out.println("[-1, -1]".equals(Arrays.toString(new Solution().searchRange(nums,target))));//[-1, -1]

        nums =new int[0];
        target = 0;
        System.out.println("[-1, -1]".equals(Arrays.toString(new Solution().searchRange(nums,target))));//[-1, -1]


        nums =new int[]{3,4,5,5,6,8,7,5};
        target=5;
        System.out.println("[2,3,7]".equals(Arrays.toString(new Solution().searchRange(nums,target))));
    }

}
