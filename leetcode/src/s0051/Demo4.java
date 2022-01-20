package s0051;

public class Demo4 {
   public boolean EightQueenDemo4Test(int[] queen) {
        int i, j, flag = 1;
        for (i = 0; i < 8; ++i) {
            for (j = 0; j < 8; ++j) {
                if (i != j) {
                    if (queen[i] == queen[j]) {
                        flag = 0;
                    } else if (Math.abs(queen[i] - queen[j]) == Math.abs(i - j)) {
                        flag = 0;
                    }
                }
            }
        }
        if (flag == 1) {
            //若该方法可行则返回true
            return true;
        }return false;
    }
}
