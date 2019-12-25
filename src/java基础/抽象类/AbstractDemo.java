package java基础.抽象类;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("张三","四川省成都市武侯区",
                3,3600.00);
        Employee e = new Salary("李四", "四川省成都市双流区",
                2, 2400.00);    //即使子类与父类的构造方法参数不一致，也能多态化

//        s.name="王五";
//        System.out.println(s.getName());
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        s.abs();
        s.test();
        s.son();
     //   s.siyou1();

        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
        ((Salary) e).son();
     //  ((Salary) e).siyou1();


    }
}
