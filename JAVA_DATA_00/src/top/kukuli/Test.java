package top.kukuli;

/**
 * @Author: kuku_Li
 * @Date: 2021 - test - 30 -14:24
 * @Description: com.msb
 * @Project: IDEA_Workspace
 */
public class Test {
    public static void main(String[] args) {
        char b = '\u0040';
        System.out.println(b);
        boolean isMarried = true;
        if (isMarried) {
            System.out.println("你不能参加单身party！\n很遗憾！");
        } else {
            System.out.print("你可以多谈谈女朋友！");
        }
        byte v = 10;
        byte h = 10;
        byte s = (byte) (v + h);
        System.out.println(s);
        double d1 = 12.9;
        int i1 = (int) d1;
        System.out.println(i1);
        int i2 = 128;
        byte s2 = (byte) i2;
        System.out.println(s2);
        String s1 = "Hello World!";
        System.out.println(s1);

        int number = 1001;
        String numberStr = "学号：";
        String info = numberStr + number;
        System.out.println(info);

        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);

        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);
        System.out.println(str + num + c);
        System.out.println('*' + ('\t' + "*"));
        char c1 = 'a';
        int h1 = 5;
        double d2 = .314;
        double result = c1 + h1 + d2;
        System.out.println(result);
        int x1 = 0x110A;
        System.out.println(x1);
        char c2 = 5;
        char c3 = '5';
        System.out.println(c2);
        System.out.println(c3);
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m=" + m);
        System.out.println("n=" + n);
    }
}