package S0048;

import org.junit.Test;
public class Rotate_ImageTest {
    @Test
    public void test(){
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}),new int[][]{{7,4,1},{8,5,2},{9,6,3}}));
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{7,8,9},{4,5,6},{1,2,3}}),new int[][]{{7,8,9},{4,5,6},{1,2,3}}));
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}),new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}}));
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{7,8,9},{4,5,6},{1,2,3}}),new int[][]{{1,4,7},{2,5,8},{3,6,9}}));
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}),new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}));
        System.out.println(equals(Rotate_Image.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}),new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    public static boolean equals(int[][] arr1,int[][] arr2){
        int sum1=0;
        int sum2=0;
       for (int i=0;i<arr1.length;i++){
          sum1+=arr1[i][0];
          sum2+=arr2[i][0];
       }
        return (sum1==sum2);
    }
}
