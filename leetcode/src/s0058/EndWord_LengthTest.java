package s0058;

import org.junit.Test;

public class EndWord_LengthTest {
    @Test
    public void test1(){
        System.out.println(EndWord_Length.fun(new String("hello world"))==5);
    }
    @Test
    public void test2(){
        System.out.println(EndWord_Length.fun(new String("are you ok  "))==2);
    }
    @Test
    public void test3(){
        System.out.println(EndWord_Length.fun(new String("java is good! "))==5);
    }
}
