package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 07 - 21:51
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */
public class Test41_PersonTest {
    public static void main(String[] args) {
        Person test=new Person();
        test.setAge(12);
    }
}
class Person{
    String name;
    int age;
    public void setName(String n) {
        name=n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public int getAge() {
        return age;
    }
}
