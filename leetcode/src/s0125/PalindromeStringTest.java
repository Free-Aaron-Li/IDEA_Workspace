package s0125;

import org.junit.Test;

/**
 * @ClassName SolutionTest
 * @Description TODO
 * @Date 2021/11/16 19:48
 **/
public class PalindromeStringTest {

    @Test
    public void test() {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(new PalindromeString().isPalindrome(str)); //true
        str =  "race a car";
        System.out.println(new PalindromeString().isPalindrome(str)); //false
    }
}
