package java基础.抽象类;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim","Ambehta,up",
                3,3600.00);
        Employee e = new Salary("John Adams", "Boston, MA",
                2, 2400.00);    //即使子类与父类的构造方法参数不一致，也能多态化

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
