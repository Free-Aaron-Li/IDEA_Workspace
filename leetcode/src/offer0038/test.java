package offer0038;
import org.junit.Test;

/**
 * Description: these message can be deleted
 * Author:sold out
 * Create Date: 2021/11/16 21:37
 * Version: JDK 1.8
 */
public class test {

    @Test
    public void T() {
        Solution s = new Solution();
        String[] res1 = { "abc", "acb", "bac", "bca", "cab", "cba" }; // 答案1
        String[] res2 = { "ab", "ba" }; // 答案2
        String[] res3 = { "acbd", "adbc", "bcad", "bdac", "cbad", "cdab", "abdc", "acdb", "bacd", "bdca", "cabd", "cdba", "dbac", "dcab", "abcd", "adcb", "badc", "bcda", "dabc", "dcba", "cadb", "cbda", "dacb", "dbca" }; // 答案3
        String[] res4 = { "qew", "weq", "wqe", "eqw", "qwe", "ewq" }; // 答案4
        String[] resource1 = s.permutation("abc");
        String[] resource2 = s.permutation("ab");
        String[] resource3 = s.permutation("abcd");
        String[] resource4 = s.permutation("qwe");
        System.out.println(testTwoArray(resource1, res1));
        System.out.println(testTwoArray(resource2, res2));
        System.out.println(testTwoArray(resource3, res3));
        System.out.println(testTwoArray(resource4, res4));
    }

    public boolean testTwoArray(String[] source, String[] res) {
        // 验证两个数组是否相同
        // 不考虑顺序
        String[] str1 = source;
        String[] str2 = res;
        // 验证长度
        if (str1.length != str2.length) {
            return false;
        }
        // 验证每个字符串都不同
        boolean[][] dp = new boolean[str1.length][str1.length];
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                if (i > j) {
                    dp[i][j] = dp[j][i];
                } else if (i == j) {
                    //...
                } else {
                    dp[i][j] = str1[i] == str1[j] ? true : false;
                }
            }
        }
        // 验证内容
        // 桶
        int[] array = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            String temp = str1[i];
            for (int j = 0; j < str1.length; j++) {
                if (temp.equals(str2[j])) {
                    array[j]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                System.out.println("验证失败！两个数组不同！");
                return false;
            }
        }
        System.out.println("验证成功！");
        return true;
    }
}
