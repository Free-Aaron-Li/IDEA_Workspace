package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 01 - 21 - 16:42
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 关于方法的参数传递的一些例题；
 */
public class Test36_TransferTest {
    public static void main(String[] args) {
        Test36_TransferTest test = new Test36_TransferTest();
        test.first();
    }

    public void first() {
        int i = 5;
        Value1 v = new Value1();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value1 v, int i) {
        i = 0;
        v.i = 20;
        Value1 val = new Value1();
        v = val;
        System.out.println(v.i + " " + i);
    }
}

class Value1 {
    int i = 15;
}