package top.kukuli;


public class Test_01_Bottles {                                           //“public”公开给其他类存取，“class”类的声明， “_01”类的名称。
    public static void main(String[] args) {               //用main做方法，必须要传string的数组给此方法当参数，命名为args。
//        System.out.println("Hello World!");
//       int x=1;                         //定义了x
//       System.out.println("Before the Loop!");          //输出结果 println 输出+换行，当然可以用printf格式输出：System.out.printf("%+8.3f\n", 3.14);
//       while (x<4)
//       {
//           System.out.println("In the Loop!");
//           System.out.println("Value of x is"+x);           //用“+”将字符串串联
//           x=x+1;
//       }
//    System.out.println("This is after the loop! ");
        //
        int x = 1;
        while (x < 4) {
            System.out.print("Doo");
            System.out.println("Bee");
            x = x + 1;
            if (x == 2) {
                System.out.println();
            }
        }
        if (x == 4) {
            System.out.println("Do");
        }
        if (x == 3) {
            System.out.println("x must is 3!");
        } else {
            System.out.println("x is NOT 3");
        }
        System.out.println("This runs no matter what");
    }


}
