package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 08 -19:16
 * @Description: com.msb
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
/*public class Test11_Prime_number {
    public static void main(String[] args) {
        System.out.println("100以内的质数有");
        int f = 0;
        for (int i = 2; i <= 100; i++) {
            for (int num = 2; num < i; num++) {
                if (i % num == 0) {
                    f++;
                }
            }
            if (f == 0) {
                System.out.print(i + " ");
            }
            f = 0;
        }
    }
}*/

/**
 * 方法二：
 * boolean isFlag=ture;
 * {
 * if(i%num==0){
 * iSFlag=false;
 * }
 * }
 * isFlag=ture;
 * 方法3：标签方式
 * label: for (int i = 2; i <= 100000; i++)
 * if (i % num == 0)
 * {
 * continue label;
 * }
 */
//优化
public class Test11_Prime_number {
    public static void main(String[] args) {
        System.out.println("100000以内的质数有");
//        int num1 = 0;
        boolean isFlag = true;
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            //优化二：对本身是质数的有效；
            for (int num = 2; num <= Math.sqrt(i); num++) {
                if (i % num == 0) {
                    isFlag = false;
                    break;//优化一：只对本身非质数的自然数是有效的；
                }
            }
            if (isFlag == true) {
                count++;
            }
            isFlag = true;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("花费的时间（毫秒）：" + (endTime - startTime));
        System.out.println(count);
        //不加优化7361ms;优化一：加上break735ms;优化二：加上开方15ms;
        //将num1==0改为isFlag==ture;不加优化7352ms；优化一：741ms；优化二：15ms;
    }
}
