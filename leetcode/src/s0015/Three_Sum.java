package s0015;

/**
 * @author KK
 * @create 2021/11/12 20:41
 */
public class Three_Sum {
    /**
     * 给定一个数组，要求在这个数组中找出 3 个数之和为 0 的所有组合。
     * @param numbers   待查找的数组
     * @return  返回一个二维数组
     *          找到返回例：int{
     *                          {-1, 0, 1},
     *                          {-1, -1, 2}
     *                       }
     *          未找到返回例： return null
     */
    public static int[][] three_Sum(int [] numbers){
        int a= numbers.length;
        int [][] num=new int[40][3];
        int i=0,j=0,k=0;
        int n=0;
        for ( i = 0; i < a; i++) {
            for(j=i+1;j<a+1;j++){
                for (k = i+2; k < a+2; k++) {
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                        for(n=0;n<a;n++){
                            num[n][0]=numbers[i];
                            num[n][1]=numbers[j];
                            num[n][2]=numbers[k];
                            System.out.println("{"+num[n][0]+","+num[n][1]+","+num[n][2]+"}"+",");
                        }
                    }
                }
            }
        }
            return null;
    }
}
