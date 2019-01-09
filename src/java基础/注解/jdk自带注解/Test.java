package java基础.注解.jdk自带注解;

import org.apache.xerces.dom.PSVIAttrNSImpl;

public class Test {
    /*@SuppressWarnings 表示忽略指定警告，比如@Suppvisewarnings("Deprecation")*/
    @SuppressWarnings("deprecation")
    public void sing(){
        Person p = new Child();

        p.sing();
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.sing();
        Child c = new Child();
        int a = c.age();
        System.out.println(a);
    }
}
