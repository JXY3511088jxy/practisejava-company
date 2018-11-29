package java基础.数字与字符串.装箱拆箱;

/**
 * Byte,Short,Integer,Long,Float,Double
 * 这些类都是抽象类Number的子类
 */
public class TestNumber {
    public static void main(String[] args) {
        int i = 5;

        //把一个基本类型的变量,转换为Integer对象，基本类型转换成封装类型
        Integer it = new Integer(i);
        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);
        //自动转换就叫装箱
        Integer it2 = i;
        //把一个Integer对象，转换为一个基本类型的int，封装类型转换成基本类型
        int i2 = it.intValue();
        //自动转换就叫拆箱
        int i3 = it;

        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);
    }
}
