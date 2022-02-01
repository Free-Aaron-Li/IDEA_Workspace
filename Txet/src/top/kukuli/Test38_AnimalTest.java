package top.kukuli;

/*
 * @author: Aaron.Li
 * @data: 2022 - 02 - 01 - 下午3:30
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 *面向对象的特征一：封装与隐藏
 * 一、问题的引入
 *  当我们创建一个类的对象以后，我们通过“对象.属性”的方式，对对象的属性进行赋值。其中赋值操作受到属性的数据类型和存储范围的制约。但是在实际的情况中，
 *  我们往往需要添加额外的条件。这个条件就不能在属性声明时体现，我们只能够通过方法添加限制条件。（比如：通过添加私有(private)，来使得不能调用legs
 *  属性，从而达到想要的目的）-->这就是封装性的体现
 */
public class Test38_AnimalTest {
    public static void main(String[] args) {
        Animal test = new Animal();
        test.name = "阿福";
        test.ages = 4;
        //test.legs = 4;
        test.show();
        System.out.println();
        test.setlegs(-1);
    }
}

/**
 * 创建一个类Animal
 */
class Animal {
    String name;
    int ages;
    private int legs;

    public void setlegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public void show() {
        System.out.println("This is " + name + ",it's ages is:" + ages + "it's legs is" + legs);
    }
}

