package s0045;

import org.junit.Test;

public class Jump_Game_Test {
   @Test
    public void test1(){
       int step=Jump_Game.fun(new int[]{2, 3, 1, 1, 4});
       System.out.println(step==2);
   }
   @Test
   public void test2(){
      int step=Jump_Game.fun(new int[]{2, 1, 1, 1, 4});
      System.out.println(step==3);
   }
   @Test
   public void test3(){
      int step=Jump_Game.fun(new int[]{5, 3, 1, 1, 4});
      System.out.println(step==1);
   }
}
