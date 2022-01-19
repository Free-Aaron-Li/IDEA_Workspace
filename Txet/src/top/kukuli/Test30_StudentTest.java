package top.kukuli;

import com.kukuli.test.Test30;

/**
 * @Author: Aaron.Li
 * @Date: 2022 - 1 - 15 - 10:49
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test30_StudentTest {
    /**
     * 定义类student,包含三个属性：学号number(int),年级state(int),成绩score(int)。
     * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
     * 问题一：打印出3年级(state值为3)的学生信息
     * 问题二：使用冒泡牌序按学生成绩排序，并遍历所有学生信息
     * <p>
     * 提示：
     * 1)、生成随机数，Math.random()，返回值类型double
     * 2)、四舍五入取整，Math.round(double d)，返回值类型long
     */
    public static void main(String[] args) {
        //声明一个student类型数组（在这里我用的是Test30来表示这个student类）
        Test30[] student = new Test30[20];
        //给元素赋值
        for (int i = 0; i < student.length; i++) {
            student[i] = new Test30();
            //给Test30的对象的属性赋值
            student[i].number = i + 1;
            //年级，[1,6]
            student[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩，[0,100]
            student[i].score = (int) (Math.random() * (100 + 1));
        }
        //遍历学生数组
        Test30_StudentTest test = new Test30_StudentTest();
        //遍历学生数组
        test.print(student);
        System.out.println("****************************************");
        //问题一：打印特定年级学生信息
        test.searchState(student, 3);
        System.out.println("****************************************");
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        test.sort(student);
        test.print(student);
        System.out.println("******************************");
    }

    /**
     * 遍历学生数组
     */
    public void print(Test30[] student) {
        for (Test30 test30 : student) {
            System.out.println("学生学号：" + test30.number + "\n年级：" + test30.state + "，成绩：" + test30.score);
        }
        System.out.println("hello world!");
    }

    /**
     * 查找student数组中指定年级的学生信息
     *
     * @param student 要查找的数组
     * @param state   要查找的年级
     */
    public void searchState(Test30[] student, int state) {
        for (Test30 test30 : student) {
            if (test30.state == state) {
                System.out.println(test30.info());
            }
        }
    }

    /**
     * 给student数组排序
     * * @param student
     */
    public void sort(Test30[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - 1; j++) {
                if (student[j].score > student[j + 1].score) {
                    Test30 temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
    }
}
