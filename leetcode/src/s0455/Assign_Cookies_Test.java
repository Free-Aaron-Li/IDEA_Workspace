package s0455;

import org.junit.Test;

public class Assign_Cookies_Test {
    @Test
    public void test() {
        System.out.println(Assign_Cookies.findContentChildren(new int[]{1,2,3},new int[]{1,1}) == 1);
        System.out.println(Assign_Cookies.findContentChildren(new int[]{1,2},new int[]{1,2,3}) == 2);
        System.out.println(Assign_Cookies.findContentChildren(new int[]{1,5,6,9},new int[]{2,4,6,9}) == 3);
        System.out.println(Assign_Cookies.findContentChildren(new int[]{4,4,4,5,5},new int[]{1,2,4,4}) == 2);
    }
}
