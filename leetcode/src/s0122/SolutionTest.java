package s0122;

import org.junit.Test;


public class SolutionTest {

    @Test
    public void maxProfit() {
        int [] price1 = {7,1,5,3,6,4};
        int [] price2 = {7,6,4,3,1};

        System.out.println(Solution.maxProfit(price1)==7);//true
        System.out.println(Solution.maxProfit(price2)==0);//true

    }
}