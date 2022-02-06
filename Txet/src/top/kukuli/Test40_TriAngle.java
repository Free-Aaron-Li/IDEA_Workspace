package top.kukuli;

/*
 * @author: Aaron.Li
 * @data: 2022 - 02 - 02 - 下午1:13
 * @project: IDEA_Workspace
 * @version: JDK17.0.2
 */
public class Test40_TriAngle {
    private double base;
    private double height;

    /**
     * 创建空构造器
     */
    public Test40_TriAngle(){
    }

    /**
     *
     * @param a
     * @param b
     */
    public Test40_TriAngle(double a,double b){
        base=a;
        height=b;
    }
    public void setBase(double b){
        base=b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double a){
        height=a;
    }
    public double getHeight(){
        return height;
    }
}
