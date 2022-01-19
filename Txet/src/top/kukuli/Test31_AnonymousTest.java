package top.kukuli;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 17 - 12:38
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */

/**
 * 学习和测试匿名对象
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象；
 * 2.特征：匿名对象只能调用一次；
 * 3.使用：如下：
 */
public class Test31_AnonymousTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();
        //匿名对象的使用
        //匿名对象：用一次情况
        new Phone().sendEmail();
        new Phone().price = 1999;
        new Phone().showprice();
        System.out.println("*************************************************");
        //匿名对象：使用多次情况
        PhoneMall mall = new PhoneMall();
        mall.show(p);
        System.out.println("*************************************************");
        mall.show(new Phone());
    }
}

class PhoneMall {
    public void show(Phone phone1) {
        phone1.sendEmail();
        phone1.playGame();
    }
}

class Phone {
    double price;//价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("打游戏");
    }

    public void showprice() {
        System.out.println("手机价格是：" + price);
    }

}