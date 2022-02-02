package top.kukuli;

/*
 * @author: Aaron.Li
 * @data: 2022 - 02 - 02 - 下午1:13
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */
public class Test39_Person {
    private int age;
    public void setAge(int a){
        if(a<0||a>130){
            throw new RuntimeException("传入数据非法！");//报错
            //System.out.println("传入数据非法");
        }else{
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
    //绝对不要这样一起写
/*    public int dogAge(int a){
        if(a<0||a>130){
            throw new RuntimeException("传入数据非法！");//报错
            //System.out.println("传入数据非法");
        }else{
            age=a;
        }
        return age;
    }*/
}
