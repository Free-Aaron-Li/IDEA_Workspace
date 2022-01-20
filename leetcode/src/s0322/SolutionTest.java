package s0322;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void coinChange() {
        int [] coins = {1,2,5};
        Solution solution = new Solution();
        System.out.println(solution.coinChange(coins,0)==0); //true
        System.out.println(solution.coinChange(coins,11)==3);//true
        System.out.println(solution.coinChange(coins,5)==1); //true
        System.out.println(solution.coinChange(coins,-2)==-1);//true
    }
}