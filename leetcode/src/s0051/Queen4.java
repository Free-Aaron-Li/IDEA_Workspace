package s0051;

public class Queen4 {
    Demo4 test=new Demo4();
  public   boolean set_queen() {
      boolean answer=false;
        int[] queen = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i;
        while (queen[8] != 1) {
            ++queen[0];
            for (i = 0; i < 8; ++i) {
                if (queen[i] == 8) {
                    queen[i] = 0;
                    ++queen[i + 1];
                }
            }
            //摆放后调用位置冲突算法
            answer= test.EightQueenDemo4Test(queen);
        }
return answer;
    }
}
