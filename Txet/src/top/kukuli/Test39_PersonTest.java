package top.kukuli;
/*
 * @author: Aaron.Li
 * @data: 2022 - 02 - 02 - 下午1:13
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 1.创建程序，在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄（0～130），用getAge()返回人的年龄。在PersonTest类中实例化Person类的
 * 对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * 推送至Github
 */
public class Test39_PersonTest {
    public static void main(String[] args) {
        Test39_Person test = new Test39_Person();
        test.setAge(12);
        System.out.println("年龄为：" + test.getAge());
    }
}