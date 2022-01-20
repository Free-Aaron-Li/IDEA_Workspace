package S0073;

import org.junit.Test;

public class Set_Matrix_ZeroesTest {
    @Test
    public void test(){
        System.out.println(equals(Set_Matrix_Zeroes.setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}}),1));
        System.out.println(equals(Set_Matrix_Zeroes.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}}),2));
        System.out.println(equals(Set_Matrix_Zeroes.setZeroes(new int[][]{{1,1,2,10},{3,4,5,2},{1,3,1,5}}),0));
        System.out.println(equals(Set_Matrix_Zeroes.setZeroes(new int[][]{{1,3,0,5},{3,4,0,90},{1,0,1,5}}),3));
    }
    public static boolean equals(int[][] arr1,int count){
        int temp=count;
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[0].length;j++){
                if (arr1[i][j]==0){
                    temp++;
                }
            }
        }
        return (temp>count);
    }
}

