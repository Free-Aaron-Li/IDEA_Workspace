package student;

/*
 * @author: Aaron.Li
 * @data: 2022 - 01 - 30 - 下午1:58
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        String s1 = "hello";
        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);
        System.out.println(s1);
    }
                                                                                          
    public void change(String s) {
        s = "hi~~";
    }
}








































