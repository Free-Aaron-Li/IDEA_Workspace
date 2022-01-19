package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 04 -15:01
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @version: JDK17.0.1
 */
public class Test1_Digital_Disassembly {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("数字：=" + num + "的情况如下：");
        System.out.print("个位数：=" + num % 10 + "\n" + "十位数：=" + num / 10 % 10 + "\n" + "个位数：=" + num / 100 + "\n");
    }
}
