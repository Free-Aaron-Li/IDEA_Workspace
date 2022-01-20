package s0162;

import org.junit.Test;

public class Find_PeakTest {
    @Test
    public void test1(){
        int index = Find_Peak.fun(new int[]{1,5,2,7,6});
        System.out.println(index==1||index==3);
    }
    @Test
    public void test2(){
        int index = Find_Peak.fun(new int[]{8,12,2,6,8,1});
        System.out.println(index==1||index==4);
    }
    @Test
    public void test3(){
        int index = Find_Peak.fun(new int[]{8,5,1,4,6,1});
        System.out.println(index==4);
    }
}
