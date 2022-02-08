package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 06 - 22:14
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 总结：属性赋值的先后顺序
 * ------------------------------------------------------------------------------------------------------------
 * ① 默认初始化值
 * ② 显式初始化
 * ③ 构造器中赋值
 * ------------------------------------------------------------------------------------------------------------
 * ④ 通过“对象.方法”或“对象.属性”的方式，赋值。
 * <p>
 * 以上操作的先后顺序：① -> ② -> ③ -> ④
 */
public class Test41_UserTest {
    public static void main(String[] args) {
        User test = new User();
        System.out.println(test.age);
        User testOne = new User(12);
        testOne.setAge(3);
        System.out.println(testOne.age);
    }
}

class User {
    String name;
    int age = 1;

    public User() {

    }

    public User(int a) {
        age = a;
    }

    public void setAge(int a) {
        age = a;
    }
}
