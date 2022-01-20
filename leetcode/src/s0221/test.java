package s0221;
import org.junit.Test;

/**
 * Author:何正清
 * Create Date: 2021/11/16 21:58
 */
public class test {

    @Test
    public void T() {
        Solution s = new Solution();
        // 实验数据
        char[][] resource1 = { { '0', '1', '1' }, { '0', '1', '1' }, { '0', '1', '1' }, { '0', '1', '1' } };
        char[][] resource2 = { { '1', '1', '1' }, { '1', '1', '1' }, { '1', '1', '1' }, { '1', '1', '1' } };
        char[][] resource3 = { { '0', '1', '0' }, { '0', '1', '0' }, { '1', '1', '0' }, { '0', '1', '1' } };
        char[][] resource4 = { { '0', '1', '1', '1' }, { '0', '1', '0', '1' }, { '0', '1', '1', '1' }, { '0', '1', '1', '1' } };
        // 测试
        System.out.println(s.MaximalSquare(resource1) == 4 ? true : false);
        System.out.println(s.MaximalSquare(resource2) == 9 ? true : false);
        System.out.println(s.MaximalSquare(resource3) == 1 ? true : false);
        System.out.println(s.MaximalSquare(resource4) == 4 ? true : false);
    }
}
