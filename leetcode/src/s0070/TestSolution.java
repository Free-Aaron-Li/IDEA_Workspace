package s0070;

import org.junit.Test;

public class TestSolution {

	@Test
	public void test() {
		int num = 2;
		System.out.println("爬到" + num + "阶所需方法数为" + Solution.climbStairs(num));//预值为2
		
		int num1 = 3;
		System.out.println("爬到" + num1 + "阶所需方法数为" + Solution.climbStairs(num1));//预值为3
		
		int num2 = 4;
		System.out.println("爬到" + num2 + "阶所需方法数为" + Solution.climbStairs(num2));//预值为5
		
		int num3 = 5;
		System.out.println("爬到" + num3 + "阶所需方法数为" + Solution.climbStairs(num3));//预值为8
		
		int num4 = 10;
		System.out.println("爬到" + num4 + "阶所需方法数为" + Solution.climbStairs(num4));//预值为89
	}

}
