package s0217;

/**
 * @author 清风学Java
 * @date 2021/11/17
 * @apiNote
 */
public class Test {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5,6,5,23,4};
        int[] nums2 = {1,2,3,5,6,7,23,47};
        System.out.println(ContainsDuplicate.containsDuplicate(nums1));
        System.out.println(ContainsDuplicate.containsDuplicate(nums2));
    }
}
