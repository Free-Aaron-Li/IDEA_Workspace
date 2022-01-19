package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 20 -14:18
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test18_CopyOfArray {
    public static void main(String[] args) {
        /*①声明array1和array2两个int[]型变量，将array1初始化为8个素数：2、3、5、11、13、17、19；
         *②赋值array2变量等于array1，修改array2中的偶数索引元素，使其等于索引值（如array[0]=0,array[2]=2);
         * array1和array2是什么关系；
         * 实现array2对array1数组的复制；
         * */
        //声明数组；
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 11, 13, 17, 19};
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        array2 = array1;//将array1的地址值赋值给array2，所以不能相当于数组的复制；
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        //实际上应该这样：
        System.out.println("真正的复制：");
        int[] arr = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arr[i] = array1[i];
        }
    }
}
