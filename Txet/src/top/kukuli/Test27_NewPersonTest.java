package top.kukuli;

import com.kukuli.test.NewPerson;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 14 - 10:11
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test27_NewPersonTest {
    public static void main(String[] args) {
        NewPerson p1 = new NewPerson();
        p1.name = "Tom";
        p1.age = 1;
        p1.sex = 1;
        p1.study();
        p1.showAge();
        System.out.println(p1.name + " age is " + p1.addAge(2));
    }
}
