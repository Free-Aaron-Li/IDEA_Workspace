package offer0003;

/**
 * @author 清风学Java
 * @date 2021/11/16
 * @apiNote
 */
public class Test {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5,6,5,23,4};
        int[] nums2 = {1,2,3,5,6,7,23,47};
        System.out.println("nums1数组的其中一个重复元素是："+(FindRepeatNumber.findRepeatNumber(nums1) == -1 ? "没有": FindRepeatNumber.findRepeatNumber(nums1)));
        System.out.println("nums2数组的其中一个重复元素是："+(FindRepeatNumber.findRepeatNumber(nums2) == -1 ? "没有": FindRepeatNumber.findRepeatNumber(nums2)));
    }
}
