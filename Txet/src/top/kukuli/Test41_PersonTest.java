package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 07 - 下午8:34
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * this关键字的使用：
 * 1.this可以用来修饰：属性、方法、构造器
 * 2.this修饰属性和方法：
 * this理解为当前对象
 * 2.1 在类的方法中，我们可以使用“this.属性”或“this.方法”的方法，调用当前对象属性或方法。但是，通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和属性
 * 同名时，我们必须显式的使用“this.”的方式，表明此变量是属性，而非形参。
 */
/*
 this关键字的使用：
 1.this可以用来修饰：属性、方法、构造器
 2.this修饰属性和方法：
 this理解为当前对象
 2.1 在类的方法中，我们可以使用“this.属性”或“this.方法”的方法，调用当前对象属性或方法。但是，通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和属性
 同名时，我们必须显式的使用“this.”的方式，表明此变量是属性，而非形参。
*/
public class Test41_PersonTest {
    public static void main(String[] args) {
        Person test = new Person();
        test.setAge(1);
        System.out.println(test.getAge());
        test.eat();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;//就近原则
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("人吃饭");
        study();//在同一个类中可以直接调用方法；
        this.study();//可以直接省略this
    }

    public void study() {
        System.out.println("人学习");
    }
}

