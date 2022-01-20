package s0001;

import org.junit.Test;

public class Two_SumTest {
              //这是测试代码//测试完成了
	@Test
	public void test() {
		System.out.println("[1,5]".equals(Two_Sum.two_Sum(new int[]{0,-1,2,7,5,4,6}, 3)));
		System.out.println("[1,2]".equals(Two_Sum.two_Sum(new int[]{3,2,4}, 6)));
		System.out.println("[0,1]".equals(Two_Sum.two_Sum(new int[]{3, 2, 4}, 5)));
		System.out.println("[0,1]".equals(Two_Sum.two_Sum(new int[]{0,1}, 1)));
		System.out.println(Two_Sum.two_Sum(new int[]{0,3}, 5) == null);
	}
 
}
