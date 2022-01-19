package top.kukuli;

/**
 * @Author: ku ku_Li
 * @Date: 2021 - 12 - 11 -17:24
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class FamilyAccount01 {
    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录用户的支出和收入
        String details = " 收支\t\t账户金额\t\t收支金额\t\t说  明";
        //初始金额
        int balance = 10000;
        while (isFlag) {
            System.out.println("-----------------家庭收支记账情况-----------------" + "\n");
            System.out.println("                    1.收支明细");
            System.out.println("                    2.登记收支");
            System.out.println("                    3.登记支出");
            System.out.print("                    4.退     出\n");
            System.out.print("                    请选择<1-4>: ");
            //获取用户的选择：1-4 
            char selection = Family_Account_Utility.readMenuSelection();
            switch (selection) {
                case '1' -> {
                    //1.收支明细
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println();
                    System.out.println("-------------------------------------------------------");
                }
                case '2' -> {
                    //2.登记收支
                    System.out.println("本次收入金额：");
                    int addMoney = Family_Account_Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String addInfo = Family_Account_Utility.readString();
                    //处理balance
                    balance += addMoney;
                    //处理details
                    details += ("\n" + " 收入\t\t" + balance + "\t\t\t" + addMoney + "\t\t\t" + addInfo);
                    System.out.println("----------------------输入完成-----------------------");
                }
                case '3' -> {
                    //3.登记支出
                    System.out.println("本次支出金额：");
                    int minusMoney = Family_Account_Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String minusInfo = Family_Account_Utility.readString();
                    //处理balance
                    if (balance >= minusMoney) {
                        balance -= minusMoney;
                        //处理details
                        details += ("\n" + " 收入\t\t" + balance + "\t\t\t" + minusMoney + "\t\t\t" + minusInfo);
                    } else {
                        System.out.println("支出超出账户额度，支付失败！");
                    }
                    System.out.println("----------------------输入完成-----------------------");
                }
                case '4' -> {
                    System.out.println("4.确认是否退出(Y/N): ");
                    char isExit = Family_Account_Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                }
                default -> System.out.println();
            }
        }
    }
}

