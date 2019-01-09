package java基础.注解.jdk自带注解;

public class Child implements Person {
    /*@Override 表示覆盖或重写父类的方法*/
    @Override
    public String name(){
        System.out.println("重写接口的name方法");
        return null;
    }

    @Override
    public int age(){
        System.out.println("重写接口的age方法");
        return 0;
    }

    @Override
    public void sing(){
        System.out.println("重写接口的sing方法");
    }
}
