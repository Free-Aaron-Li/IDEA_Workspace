package s0035;

import org.junit.Test;
public class Seacrh_Insert_PositionTest {
    @Test
    public  void test(){
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 5)==2);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 2)==1);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 7)==4);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 0)==0);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 0)==0);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 3)==5);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 2)==2);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 3)==1);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 1)==4);
        System.out.println(Seacrh_Insert_Position.SearchInsert(new int[]{1,3,5,6}, 3)==0);
    }
    }


