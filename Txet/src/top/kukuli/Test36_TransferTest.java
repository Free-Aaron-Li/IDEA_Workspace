package top.kukuli;

/*
 * @author: Aaron.Li
 * @date: 2022 - 01 - 21 - 16:42
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */

/**
 * 关于方法的参数传递的一些例题；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 * <p>
 * 例题一：值传递考察；
 */
/**
 * 例题一：值传递考察；
 */
/*
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
*/

/**
 * 例题二：
 * （1） 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积；
 * （2） 定义一个PassObject类，在类中定义一个方法printAreas()，该方法的定义如下：
 *  public void printAreas(Circle c,int time)。在printAreas方法中打印输出1到time之间的每个整数半径值，
 *  以及对应的面积。
 *  例如：times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 */
public class Test36_TransferTest {
    public static void main(String[] args) {
        System.out.println("Radius             " + "Area");
        PassObject test = new PassObject();
        Circle a = new Circle();
        test.printAreas(a, 5);
    }
}

class Circle {
    /**
     * 圆半径
     */
    double radius;

    /**
     * 计算圆面积；
     * @param radius：半径
     * @return area 圆面积；
     */
    public double findArea(double radius) {
        double area;
        area = 3.1415926 * radius * radius;
        return area;
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {
        Circle p = new Circle();
        for (double i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(i + "                  " + p.findArea(c.radius));
        }
        System.out.println();
        System.out.println("now radius is:" + time);
    }
}