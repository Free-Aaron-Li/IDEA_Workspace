package s0134;

import org.junit.Test;

public class CanCompleteCircuit_Test {
    @Test
    public void test() {
        System.out.println(CanCompleteCircuit.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}) == 3);
        System.out.println(CanCompleteCircuit.canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3}) == -1);
    }
}
