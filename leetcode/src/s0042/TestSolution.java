package s0042;

import org.junit.Test;

public class TestSolution {

	@Test
	public void test() {
		int[] test1 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("此数组可累计积水量为" + Solution.trap(test1));//预值为6
		
		int[] test2 = new int[]{3,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("此数组可累计积水量为" + Solution.trap(test2));//预值为14
		
		int[] test3 = new int[]{2,1,2,3,1,0,1,3,2,0,2,1};
		System.out.println("此数组可累计积水量为" + Solution.trap(test3));//预值为10
		
		int[] test4 = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("此数组可累计积水量为" + Solution.trap(test4));//预值为0
		
		int[] test5 = new int[]{0,1,2,3,4,5,5,4,3,2,1,0};
		System.out.println("此数组可累计积水量为" + Solution.trap(test5));//预值为0
	}

}
