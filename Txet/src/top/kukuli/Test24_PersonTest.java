package top.kukuli;

import com.kukuli.test.Person;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 25 -19:30
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test24_PersonTest {
    public static void main(String[] args) {
        //创建Person的类（类的实例化）；
        Person p1 = new Person();
        //Scanner scanner=new Scanner(System.in);
        //调用对象的结构：属性、方法；
        //调用属性："对象.属性";
        p1.name = "Tom";
        p1.age = 0;
        p1.isMale = true;
        //调用方法："对象.方法";
        p1.eat();
        p1.sleep();
        p1.talk("chinese");
        Person p2 = new Person();
        System.out.println(p2.name);
        Person p3 = p1;
        p3.age = 10;
    }
}
