package s0053;

import org.junit.Test;

public class TestSolution {

	@Test
	public void test() {
		int[] nums = {-1,2,-3,7,1};
		System.out.println("最大和的连续子数组和是" + Solution.maxSubArray(nums));//预期值为8
		
		int[] nums1 = {1,3,-9,8,0,5};
		System.out.println("最大和的连续子数组和是" + Solution.maxSubArray(nums1));//预期值为13
		
		int[] nums2 = {0,0,0,-9,-1,-5};
		System.out.println("最大和的连续子数组和是" + Solution.maxSubArray(nums2));//预期值为0
		
		int[] nums3 = {-1,-2,-3,-4,-5};
		System.out.println("最大和的连续子数组和是" + Solution.maxSubArray(nums3));//预期值为-1
	}

}
