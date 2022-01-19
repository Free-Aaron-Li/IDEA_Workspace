package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 05 -21:08
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */
/*
 *目的：让10进制60转为16进制·
 */
public class Test4_Base_System {
    public static void main(String[] args) {
        /*方法1：导包
         * */
        String str1 = Integer.toHexString(60);
        System.out.println("60的16进制为" + str1 + "。");
        /*方法2：手动实现
         * */
        int B = 60;
        int H = B & 15;
        String num1 = (H > 9) ? (char) (H - 10 + 'A') + "" : H + "";
        int temp = B >>> 4;
        H = temp & 15;
        String num2 = (H > 9) ? (char) (H - 10 + 'A') + "" : H + "";
        System.out.println("60的16进制为" + num2 + num1 + "。");
    }
}
