package java基础.反射.D调用方法;

import java基础.多线程.Hero;

import java.lang.reflect.Method;

/**
 * 通过反射机制，调用一个对象的方法
 */
public class TestReflection {

    public static void main(String[] args) {
        Hero h = new Hero();


        try {
            //获取这个名字叫做setName,参数类型是String的方法
            Method m = h.getClass().getMethod("setOtherName", String.class);
            //对h对象，调用这个方法
            m.invoke(h,"盖伦");
            //使用传统的方式，调用getName的方法
            System.out.println(h.getOtherName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
