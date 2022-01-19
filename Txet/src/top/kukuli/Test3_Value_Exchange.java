package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 04 -18:34
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */
public class Test3_Value_Exchange {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        /*方法1：定义临时变量的方式
         * */
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1=" + num1 + "\n" + "num2=" + num2);
        /*方法二：数值交换
         *缺点：1.相加范围可能超过存储范围；
         * 2.局限性：只能用于数值类型；
         * */
        int num3 = 30;
        int num4 = 40;
        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;
        System.out.println("num3=" + num3 + "\n" + "num4=" + num4);
        /*方法三：异或位运算
         *缺点：局限性：只能用于计算数值类型；
         * */
        int num5 = 50;
        int num6 = 60;
        num5 = num5 ^ num6;
        num6 = num5 ^ num6;
        num5 = num5 ^ num6;
        System.out.println("num5=" + num5 + "\n" + "num6=" + num6);
    }
}
