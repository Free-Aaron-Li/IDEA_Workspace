package top.kukuli;

import java.util.Arrays;

/**
 * @Author: kuku_Li
 * @Data:2021/11/29-test-29-14:38
 * @Description:com.msb
 * @Project_name:IDEA_Workspace
 */
public class Java {
    public static void main(String[] args) {
        System.out.println("helllo !");
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
        int a = 10;
        int b = 20, c = 30;
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 56;
        arr[2] = 98;
        arr[3] = 66;
        Arrays.toString(arr);
        int d = eat();
        System.out.println(d);
//        for (int i = 0; i < a; i++) {
//            i++;
//            System.out.println(a);
    }

    public static int eat() {
        System.out.println("----1");
        System.out.println("----2");
        System.out.println("----3");
        System.out.println("----4");
        return 10;
    }
}

