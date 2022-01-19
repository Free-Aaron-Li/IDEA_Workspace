package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 04 -16:54
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */
public class Test2_Short_Circuit_Operation {
    public static void main(String[] args) {
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在东京！");
        } else {
            System.out.println("我现在在西京！");
        }
        System.out.println("num1=" + num1);
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("我现在在东京！");
        } else {
            System.out.println("我现在在西京！");
        }
        System.out.println("num2=" + num2);
        /*
         * */
        int x = 1;
        int y = 1;
        if (x++ == 2 & y == 1) {
            x = 7;
        }
        System.out.println("x=" + x + "y=" + y);
        boolean x1 = true;
        boolean y1 = false;
        short z = 42;
        //if(y==ture)
        if ((z++ == 42) && (y1 = true)) {
            z++;
        }
        if ((x1 = false) || (++z == 45)) {
            z++;
        }
        System.out.println("z=" + z);
        /*
         * */
        int z1 = 10;
        if (false || true) {
            z1++;
        }
        System.out.println(z1);
        /*
         * */
        short i = 21;
        System.out.println(i << 2);
        short i1 = -1;

        System.out.println(i >> 2);
    }
}
