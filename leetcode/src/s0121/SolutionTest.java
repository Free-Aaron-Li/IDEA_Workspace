package s0121;

import org.junit.Test;


public class SolutionTest {

    @Test
    public void maxProfit() {
        int [] price1 = {7,5,1,7,3,2};
        int [] price2 = {7,6,4,3,1};

        System.out.println(Solution.maxProfit(price1)==6);//true
        System.out.println(Solution.maxProfit(price2)==0);//true
    }
}