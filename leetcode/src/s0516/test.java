package s0516;
import org.junit.Test;

/**
 * Author:何正清
 * Create Date: 2021/11/16 21:58
 */
public class test {

    @Test
    public void T() {
        Solution s = new Solution();
        // 测试数据
        String resource1 = "bbbab";
        String resource2 = "bbabab";
        String resource3 = "abcabc";
        String resource4 = "abbbcbc";
        // 测试
        System.out.println(s.longestPalindromeSubseq(resource1) == 4 ? true : false);
        System.out.println(s.longestPalindromeSubseq(resource1) == 5 ? true : false);
        System.out.println(s.longestPalindromeSubseq(resource1) == 3 ? true : false);
        System.out.println(s.longestPalindromeSubseq(resource1) == 4 ? true : false);
    }

}
