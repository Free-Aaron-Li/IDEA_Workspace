package top.kukuli;

public class Test_03_a_b {
    public static void main(String[] args) {
//       int x=3;
//       while (x>0){
//           if(x>2){
//               System.out.print("a");
//           }
//           x=x-1;
//           System.out.print("-");
//           if(x==2){
//               System.out.print("b c");
//           }
//           if(x==1){
//               System.out.print("d");
//              x=x-1;
//           }
//       }
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

